/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_16;
/**
 *
 * @author Admin
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList; // Or java.util.List
import javax.swing.JCheckBox;

public class writeFile {

    // Added 'ArrayList<JCheckBox> checkboxList' as a parameter so this file can access it
    public void saveFile(ArrayList<JCheckBox> checkboxList) {
        boolean[] checkboxState = new boolean[256];
        for (int i = 0; i < 256; i++) {
            JCheckBox check = checkboxList.get(i);
            if (check.isSelected()) {
                checkboxState[i] = true;
            }
        }
        
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Checkbox.ser"))) {
            os.writeObject(checkboxState);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
