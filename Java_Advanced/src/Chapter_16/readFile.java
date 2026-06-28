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
import java.io.ObjectInputStream;
import java.util.List; // Or ArrayList depending on your list type
import javax.sound.midi.Sequencer;
import javax.swing.JCheckBox;

public class readFile {

    // Pass the list, the sequencer, and an instance of your main GUI class to call the build method
    public static void loadFile(List<JCheckBox> checkboxList, Sequencer sequencer, Runnable buildTrackAndStart) {
        boolean[] checkboxState = null;
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("Checkbox.ser"))) {
            checkboxState = (boolean[]) is.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for (int i = 0; i < 256; i++) {
            JCheckBox check = checkboxList.get(i);
            check.setSelected(checkboxState[i]);
        }
        
        if (sequencer != null) sequencer.stop();
        if (buildTrackAndStart != null) buildTrackAndStart.run();
    }
}
