/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_02;

/**
 *
 * @author Admin
 */
// MovieTestDrive class is used to create and test Movie objects
public class MovieTestDrive {

    // Main method - entry point of the program
    public static void main(String[] args) {

        // Create the first Movie object and assign values to its fields
        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;

        // Create the second Movie object and assign values to its fields
        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;

        // Call the playIt() method to simulate playing the movie
        two.playIt();

        // Create the third Movie object and assign values to its fields
        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }
}