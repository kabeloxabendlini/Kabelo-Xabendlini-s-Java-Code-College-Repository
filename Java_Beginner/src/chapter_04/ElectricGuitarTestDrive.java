/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_04;

/**
 *
 * @author Admin
 */
/*
 * ElectricGuitarTestDrive class
 * Creates an ElectricGuitar object, assigns values to its
 * instance variables using setter methods, and displays
 * the values using getter methods.
 */
class ElectricGuitarTestDrive {

    public static void main(String[] args) {

        // Create a new ElectricGuitar object
        ElectricGuitar guitar = new ElectricGuitar();

        // Set the guitar's brand
        guitar.setBrand("Fender");

        // Set the number of pickups on the guitar
        guitar.setNumOfPickups(3);

        // Specify that a rock star uses this guitar
        guitar.setRockStarUsesIt(true);

        // Display the guitar's brand
        System.out.println("Brand: " + guitar.getBrand());

        // Display the number of pickups
        System.out.println("Number of Pickups: " + guitar.getNumOfPickups());

        // Display whether a rock star uses the guitar
        System.out.println("Used by Rock Stars: " + guitar.getRockStarUsesIt());
    }
}