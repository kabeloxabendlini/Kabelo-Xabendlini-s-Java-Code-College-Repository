/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_07.ExtraWork;

/**
 *
 * @author Admin
 */
public class TestBoats {

    public static void main(String[] args) {

        // Create a Boat object
        Boat b1 = new Boat();

        // Create a Sailboat object
        Sailboat b2 = new Sailboat();

        // Create a Rowboat object
        Rowboat b3 = new Rowboat();

        // Set the length of the Sailboat to 32
        b2.setLength(32);

        // Call the move() method on the Boat object
        b1.move();

        // Call the move() method on the Rowboat object
        b3.move();

        // Call the move() method on the Sailboat object
        b2.move();
    }
}