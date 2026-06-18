/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_07.ExtraWork;

/**
 *
 * @author Admin
 */
public class Boat {

    // Instance variable that stores the boat's length
    private int length;

    // Setter method used to assign a value to length
    public void setLength(int len) {

        // Store the value passed into the method
        length = len;
    }

    // Getter method used to retrieve the boat's length
    public int getLength() {

        // Return the current value of length
        return length;
    }

    // Method that simulates the boat moving
    public void move() {

        // Print a message indicating movement
        System.out.print("drift ");
    }
}