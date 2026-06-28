/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_16;

/**
 *
 * @author Admin
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import static javax.sound.midi.ShortMessage.*;

public class BeatBox {

    private ArrayList<JCheckBox> checkboxList;
    private Sequencer sequencer;
    private Sequence sequence;
    private Track track;

    String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat",
        "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal", "Hand Clap",
        "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga",
        "Cowbell", "Vibraslap", "Low-mid Tom", "High Agogo",
        "Open Hi Conga"};

    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

    public static void main(String[] args) {
        new BeatBox().buildGUI();
    }

    public void buildGUI() {
        JFrame frame = new JFrame("Cyber BeatBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // --- Transport controls (Start / Stop / Tempo) ---
        Box transportBox = new Box(BoxLayout.Y_AXIS);
        transportBox.setBorder(BorderFactory.createTitledBorder("Transport"));

        JButton start = new JButton("Start");
        start.addActionListener(e -> buildTrackAndStart());
        transportBox.add(start);
        transportBox.add(Box.createVerticalStrut(4));

        JButton stop = new JButton("Stop");
        stop.addActionListener(e -> sequencer.stop());
        transportBox.add(stop);
        transportBox.add(Box.createVerticalStrut(8));

        JButton upTempo = new JButton("Tempo Up");
        upTempo.addActionListener(e -> changeTempo(1.03f));
        transportBox.add(upTempo);
        transportBox.add(Box.createVerticalStrut(4));

        JButton downTempo = new JButton("Tempo Down");
        downTempo.addActionListener(e -> changeTempo(0.97f));
        transportBox.add(downTempo);

        // --- Serialize controls, grouped separately so they don't read as transport buttons ---
        Box serializeBox = new Box(BoxLayout.Y_AXIS);
        serializeBox.setBorder(BorderFactory.createTitledBorder("Pattern"));

        JButton serializeSave = new JButton("Save Pattern");
        serializeSave.addActionListener(e -> writeFile());
        serializeBox.add(serializeSave);
        serializeBox.add(Box.createVerticalStrut(4));

        JButton serializeLoad = new JButton("Load Pattern");
        serializeLoad.addActionListener(e -> readFile());
        serializeBox.add(serializeLoad);

        // Stack the two control groups with a gap between them, anchored to the top
        Box buttonBox = new Box(BoxLayout.Y_AXIS);
        buttonBox.add(transportBox);
        buttonBox.add(Box.createVerticalStrut(12));
        buttonBox.add(serializeBox);
        buttonBox.add(Box.createVerticalGlue());

        // --- Instrument names, using the SAME grid geometry as the checkboxes ---
        // (GridLayout, not BoxLayout) so each label stays locked to its row,
        // even if the window gets resized.
        JPanel nameBox = new JPanel(new GridLayout(16, 1, 0, 1));
        for (String instrumentName : instrumentNames) {
            JLabel instrumentLabel = new JLabel(instrumentName);
            instrumentLabel.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
            nameBox.add(instrumentLabel);
        }

        background.add(BorderLayout.EAST, buttonBox);
        background.add(BorderLayout.WEST, nameBox);
        frame.getContentPane().add(background);

        GridLayout grid = new GridLayout(16, 16);
        grid.setVgap(1);
        grid.setHgap(2);
        JPanel mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);

        checkboxList = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            checkboxList.add(c);
            mainPanel.add(c);
        }

        setUpMidi();

        // pack() sizes the window to fit its components -- an explicit setBounds()
        // size right before it was just being thrown away. Center the packed window instead.
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

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

    private void buildTrackAndStart() {
        int[] trackList;
        sequence.deleteTrack(track);
        track = sequence.createTrack();

        for (int i = 0; i < 16; i++) {
            trackList = new int[16];
            int key = instruments[i];

            for (int j = 0; j < 16; j++) {
                JCheckBox jc = checkboxList.get(j + 16 * i);
                if (jc.isSelected()) {
                    trackList[j] = key;
                } else {
                    trackList[j] = 0;
                }
            }

            makeTracks(trackList);
            track.add(makeEvent(CONTROL_CHANGE, 1, 127, 0, 16));
        }

        track.add(makeEvent(PROGRAM_CHANGE, 9, 1, 0, 15));

        try {
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
            sequencer.setTempoInBPM(120);
            sequencer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void changeTempo(float tempoMultiplier) {
        float tempoFactor = sequencer.getTempoFactor();
        sequencer.setTempoFactor(tempoFactor * tempoMultiplier);
    }

    private void makeTracks(int[] list) {
        for (int i = 0; i < 16; i++) {
            int key = list[i];
            if (key != 0) {
                track.add(makeEvent(NOTE_ON, 9, key, 100, i));
                track.add(makeEvent(NOTE_OFF, 9, key, 100, i + 1));
            }
        }
    }

    private MidiEvent makeEvent(int cmd, int chnl, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(cmd, chnl, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }

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

    private void readFile() {
        boolean[] checkboxState = null;
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("Checkbox.ser"))) {
            checkboxState = (boolean[]) is.readObject();
            
            for (int i = 0; i < 256; i++) {
                JCheckBox check = checkboxList.get(i);
                check.setSelected(checkboxState[i]);
            }
            sequencer.stop();
            buildTrackAndStart();
            System.out.println("Pattern loaded successfully.");
        } catch (Exception e) {
            System.out.println("No saved pattern found or couldn't read file.");
            e.printStackTrace();
        }
    }
}