/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11;

/**
 *
 * @author Admin
 */

public class Duck {

    private int size;
    private static int duckCount = 0;

    // Constructor increments the number of Duck objects created
    public Duck() {
        duckCount++;
    }

    // Setter method
    public void setSize(int s) {
        size = s;
    }

    // Getter method
    public int getSize() {
        return size;
    }

    // Static getter for the number of Duck objects created
    public static int getDuckCount() {
        return duckCount;
    }
}