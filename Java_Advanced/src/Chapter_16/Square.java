/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_16;

/**
 *
 * @author Admin
 */
import java.io.*;

public class Square implements Serializable {

    private int width;
    private int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Square mySquare = new Square(50, 20);
        try {
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(mySquare);
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
