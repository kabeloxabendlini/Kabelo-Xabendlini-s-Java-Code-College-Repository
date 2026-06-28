/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_16.ExtraWork;

/**
 *
 * @author Admin
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DungeonTest {

    public static void main(String[] args) {
        DungeonGame d = new DungeonGame();
        
        // Output before saving: 3 + 4 + 5 = 12
        System.out.println("Before saving: " + (d.getX() + d.getY() + d.getZ()));
        
        try {
            FileOutputStream fos = new FileOutputStream("dg.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
            oos.close();

            FileInputStream fis = new FileInputStream("dg.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d = (DungeonGame) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Output after reloading: 3 + 0 + 5 = 8 (Because 'y' was transient)
        System.out.println("After loading: " + (d.getX() + d.getY() + d.getZ()));
    }
}
