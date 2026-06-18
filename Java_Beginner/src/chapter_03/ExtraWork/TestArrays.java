/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_03.ExtraWork;

/**
 *
 * @author Admin
 */
/*
 * TestArrays class
 * Demonstrates how one array can be used to determine
 * the order in which elements from another array are accessed.
 */
class TestArrays {

    public static void main(String[] args) {

        // Create an integer array to store index positions
        int[] index = new int[4];

        // Assign values to the index array
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        // Create a String array to store island names
        String[] islands = new String[4];

        // Assign island names to the array
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        // Loop counter
        int y = 0;

        // Variable used to store the current index reference
        int ref;

        // Loop through the index array
        while (y < 4) {

            // Get the value stored at the current index position
            ref = index[y];

            // Display the island located at that position
            System.out.print("island = ");
            System.out.println(islands[ref]);

            // Move to the next position in the index array
            y = y + 1;
        }
    }
}