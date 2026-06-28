/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_18;

/**
 *
 * @author Admin
 */
import javax.sound.midi.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.io.*;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.*;
import static javax.sound.midi.ShortMessage.*;

public class BeatBox {

    private JList<String> incomingList;
    private JTextArea userMessage;
    private ArrayList<JCheckBox> checkboxList;
    private Vector<String> listVector = new Vector<>();
    private HashMap<String, boolean[]> otherSeqsMap = new HashMap<>();
    private String userName;
    private int nextNum;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private Sequencer sequencer;
    private Sequence sequence;
    private Track track;

    // These are the names of the instruments, as a String array, for
    // building the GUI labels (on each row).
    String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat",
        "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal", "Hand Clap",
        "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga",
        "Cowbell", "Vibraslap", "Low-mid Tom", "High Agogo",
        "Open Hi Conga"};

    // These represent the actual drum "keys." The drum channel is like a
    // piano, except each "key" on the piano is a different drum. So the
    // number '35' is the key for the Bass drum, 42 is Closed Hi-Hat, etc.
    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

    /*
     * Final BeatBox client program
     *
     * Most of this code is the same as the code from the Code Kitchens in
     * the previous chapters, so we don't annotate the whole thing again.
     * The new parts include:
     *
     * GUI: Two new components are added for the text area that displays
     * incoming messages (actually a scrolling list) and the text field.
     *
     * NETWORKING: Just like the SimpleChatClient in this chapter, the
     * BeatBox now connects to the server and gets an input and output
     * stream.
     *
     * MULTITHREADED: Again, just like the SimpleChatClient, we start a
     * "reader" job that keeps looking for incoming messages from the
     * server. But instead of just text, the messages coming in include
     * TWO objects: the String message and the serialized array (the
     * thing that holds the state of all the checkboxes).
     *
     * All the code is available at https://oreil.ly/hfJava_3e_examples.
     *
     * (appendix A, Final Code Kitchen, page 675)
     */

    public static void main(String[] args) {
        String name = (args.length > 0) ? args[0] : "Anonymous";
        new BeatBox().startUp(name);
    }

    // Add a command-line argument for your screen name.
    // Example: % java BeatBox theFlash
    //
    // Set up the networking, I/O, and make (and start) the reader thread.
    // We're using Sockets here instead of Channels because they work
    // better with Object Input/Output streams.
    public void startUp(String name) {
        userName = name;
        // open connection to the server
        try {
            Socket socket = new Socket("127.0.0.1", 4242);
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.submit(new RemoteReader());
        } catch (Exception ex) {
            System.out.println("Couldn't connect-you'll have to play alone.");
        }
        setUpMidi();
        buildGUI();
    }

    public void buildGUI() {
        // You've seen this GUI code before, in Chapter 15.
        JFrame frame = new JFrame("Cyber BeatBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);

        // An "empty border" gives us a margin between the edges of the
        // panel and where the components are placed. (Purely aesthetic.)
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // --- Transport controls, grouped and labeled so they read as one unit ---
        Box transportBox = new Box(BoxLayout.Y_AXIS);
        transportBox.setBorder(BorderFactory.createTitledBorder("Transport"));

        // Lambda expressions call a specific method on this class when
        // the button is pressed.
        JButton start = new JButton("Start");
        start.addActionListener(e -> buildTrackAndStart());
        transportBox.add(start);
        transportBox.add(Box.createVerticalStrut(4));

        JButton stop = new JButton("Stop");
        stop.addActionListener(e -> sequencer.stop());
        transportBox.add(stop);
        transportBox.add(Box.createVerticalStrut(8));

        // The default tempo is 1.0, so we're adjusting +/- 3% per click.
        JButton upTempo = new JButton("Tempo Up");
        upTempo.addActionListener(e -> changeTempo(1.03f));
        transportBox.add(upTempo);
        transportBox.add(Box.createVerticalStrut(4));

        JButton downTempo = new JButton("Tempo Down");
        downTempo.addActionListener(e -> changeTempo(0.97f));
        transportBox.add(downTempo);

        // --- Local file save/load, separate from network sharing ---
        // This lets you keep a favorite pattern on disk even when you're
        // not connected to anyone -- different from sendIt, which shares
        // the pattern live with whoever else is on the server right now.
        Box localFileBox = new Box(BoxLayout.Y_AXIS);
        localFileBox.setBorder(BorderFactory.createTitledBorder("Local Pattern"));

        JButton savePattern = new JButton("Save Pattern");
        savePattern.addActionListener(e -> writeFile());
        localFileBox.add(savePattern);
        localFileBox.add(Box.createVerticalStrut(4));

        JButton loadPattern = new JButton("Load Pattern");
        loadPattern.addActionListener(e -> readFile());
        localFileBox.add(loadPattern);

        // --- Message + shared-beats controls, grouped separately from transport ---
        Box chatBox = new Box(BoxLayout.Y_AXIS);
        chatBox.setBorder(BorderFactory.createTitledBorder("Message & Shared Beats"));

        // Create a text area for the user to type their message.
        userMessage = new JTextArea(3, 15);
        userMessage.setLineWrap(true);
        userMessage.setWrapStyleWord(true);
        JScrollPane messageScroller = new JScrollPane(userMessage);
        chatBox.add(messageScroller);
        chatBox.add(Box.createVerticalStrut(4));

        // This is new; send the message and the current beat sequence to
        // the music server.
        JButton sendIt = new JButton("sendIt");
        sendIt.addActionListener(e -> sendMessageAndTracks());
        chatBox.add(sendIt);
        chatBox.add(Box.createVerticalStrut(8));

        // We saw JList briefly in Chapter 15. This is where the incoming
        // messages are displayed. Only instead of a normal chat where you
        // just LOOK at the messages, in this app you can SELECT a message
        // from the list to load and play the attached beat pattern.
        incomingList = new JList<>();
        incomingList.addListSelectionListener(new MyListSelectionListener());
        incomingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane theList = new JScrollPane(incomingList);
        chatBox.add(theList);
        incomingList.setListData(listVector);

        // Stack the two control groups with a gap between them, anchored to the top
        Box buttonBox = new Box(BoxLayout.Y_AXIS);
        buttonBox.add(transportBox);
        buttonBox.add(Box.createVerticalStrut(12));
        buttonBox.add(chatBox);
        buttonBox.add(Box.createVerticalGlue());

        // This border on each instrument name helps them line up with the
        // checkboxes -- using the SAME grid geometry (GridLayout, not
        // BoxLayout) as the checkbox grid, so each label stays locked to
        // its row even if the window gets resized.
        JPanel nameBox = new JPanel(new GridLayout(16, 1, 0, 1));
        for (String instrumentName : instrumentNames) {
            JLabel instrumentLabel = new JLabel(instrumentName);
            instrumentLabel.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
            nameBox.add(instrumentLabel);
        }

        background.add(BorderLayout.EAST, buttonBox);
        background.add(BorderLayout.WEST, nameBox);
        frame.getContentPane().add(background);

        // This layout manager lets you put the components in a grid with
        // rows and columns.
        GridLayout grid = new GridLayout(16, 16);
        grid.setVgap(1);
        grid.setHgap(2);
        JPanel mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);

        // Make the checkboxes, set them to "false" (so they aren't
        // checked), and add them to the ArrayList AND to the GUI panel.
        checkboxList = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            checkboxList.add(c);
            mainPanel.add(c);
        }

        // pack() sizes the window to fit its components -- an explicit
        // setBounds() size right before it was just being thrown away.
        // Center the packed window instead.
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Get the Sequencer, make a Sequence, and make a Track.
    private void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Build a track by walking through the checkboxes to get their state
    // and mapping that to an instrument (and making the MidiEvent for it).
    // This is pretty complex, but it is EXACTLY as it was in the previous
    // chapters, so refer to the Code Kitchen in Chapter 15 to get the full
    // explanation again.
    private void buildTrackAndStart() {
        ArrayList<Integer> trackList; // this will hold the instruments for each
        sequence.deleteTrack(track);
        track = sequence.createTrack();
        for (int i = 0; i < 16; i++) {
            trackList = new ArrayList<>();
            int key = instruments[i];
            for (int j = 0; j < 16; j++) {
                JCheckBox jc = checkboxList.get(j + (16 * i));
                if (jc.isSelected()) {
                    trackList.add(key);
                } else {
                    trackList.add(null); // because this slot should be empty in the track
                }
            }
            makeTracks(trackList);
            track.add(makeEvent(CONTROL_CHANGE, 1, 127, 0, 16));
        }
        track.add(makeEvent(PROGRAM_CHANGE, 9, 1, 0, 15)); // - so we always go to 16 beats
        try {
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
            sequencer.setTempoInBPM(120);
            sequencer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // The Tempo Factor scales the sequencer's tempo by the factor
    // provided, slowing the beat down or speeding it up.
    private void changeTempo(float tempoMultiplier) {
        float tempoFactor = sequencer.getTempoFactor();
        sequencer.setTempoFactor(tempoFactor * tempoMultiplier);
    }

    // This is new...it's a lot like the SimpleChatClient, except instead
    // of sending a String message, we serialize two objects (the String
    // message and the beat pattern) and write those two objects to the
    // socket output stream (to the server).
    private void sendMessageAndTracks() {
        boolean[] checkboxState = new boolean[256];
        for (int i = 0; i < 256; i++) {
            JCheckBox check = checkboxList.get(i);
            if (check.isSelected()) {
                checkboxState[i] = true;
            }
        }
        try {
            out.writeObject(userName + nextNum++ + ": " + userMessage.getText());
            out.writeObject(checkboxState);
        } catch (IOException e) {
            System.out.println("Terribly sorry. Could not send it to the server.");
            e.printStackTrace();
        }
        userMessage.setText("");
    }

    // Saves the current checkbox pattern to a local file, independent of
    // the network -- lets you keep a favorite pattern even when you're
    // not connected to anyone.
    private void writeFile() {
        boolean[] checkboxState = new boolean[256];
        for (int i = 0; i < 256; i++) {
            JCheckBox check = checkboxList.get(i);
            if (check.isSelected()) {
                checkboxState[i] = true;
            }
        }
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Checkbox.ser"))) {
            os.writeObject(checkboxState);
            System.out.println("Pattern saved successfully to Checkbox.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Loads a previously saved checkbox pattern from disk and starts
    // playing it. Reuses changeSequence() -- the same helper used when
    // loading a pattern selected from the network list -- instead of
    // duplicating that loop.
    private void readFile() {
        boolean[] checkboxState = null;
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("Checkbox.ser"))) {
            checkboxState = (boolean[]) is.readObject();
            changeSequence(checkboxState);
            sequencer.stop();
            buildTrackAndStart();
            System.out.println("Pattern loaded successfully.");
        } catch (Exception e) {
            System.out.println("No saved pattern found or couldn't read file.");
            e.printStackTrace();
        }
    }

    // This method is called when the user selects something from the
    // list. We IMMEDIATELY change the pattern to the one they selected.
    public class MyListSelectionListener implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent lse) {
            if (!lse.getValueIsAdjusting()) {
                String selected = incomingList.getSelectedValue();
                if (selected != null) {
                    // now go to the map, and change the sequence
                    boolean[] selectedState = otherSeqsMap.get(selected);
                    changeSequence(selectedState);
                    sequencer.stop();
                    buildTrackAndStart();
                }
            }
        }
    }

    private void changeSequence(boolean[] checkboxState) {
        for (int i = 0; i < 256; i++) {
            JCheckBox check = checkboxList.get(i);
            check.setSelected(checkboxState[i]);
        }
    }

    public void makeTracks(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            Integer instrumentKey = list.get(i);
            if (instrumentKey != null) {
                track.add(makeEvent(NOTE_ON, 9, instrumentKey, 100, i));
                track.add(makeEvent(NOTE_OFF, 9, instrumentKey, 100, i + 1));
            }
        }
    }

    public static MidiEvent makeEvent(int cmd, int chnl, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage msg = new ShortMessage();
            msg.setMessage(cmd, chnl, one, two);
            event = new MidiEvent(msg, tick);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }

    // This is also new -- a ListSelectionListener that tells us when the
    // user made a selection on the list of messages. When the user
    // selects a message, we IMMEDIATELY load the associated beat pattern
    // (it's in the HashMap called otherSeqsMap) and start playing it.
    // There's some if tests because of little quirky things about getting
    // ListSelectionEvents.
    //
    // All the MIDI stuff is exactly the same as it was in the previous
    // versions.
    public class RemoteReader implements Runnable {

        public void run() {
            try {
                Object obj;
                while ((obj = in.readObject()) != null) {
                    System.out.println("got an object from server");
                    System.out.println(obj.getClass());
                    String nameToShow = (String) obj;
                    boolean[] checkboxState = (boolean[]) in.readObject();
                    otherSeqsMap.put(nameToShow, checkboxState);
                    listVector.add(nameToShow);
                    incomingList.setListData(listVector);
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}