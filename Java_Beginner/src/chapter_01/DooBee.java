/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_01;

/**
 *
 * @author Admin
 */
public class DooBee {
    public static void main(String[] args) {

        // Declare and initialize loop counter x with value 1
        int x = 1;

        // Loop runs while x is less than 3 (runs for x = 1 and x = 2)
        while (x < 3) {

            // Print "Doo" and "Bee" on each iteration, building the "DooBee" pattern
            System.out.print("Doo");
            System.out.print("Bee");

            // Increment x by 1 each iteration, loop exits when x reaches 3
            x = x + 1;
        }

        // After the loop, x will always be 3, so this condition is always true
        if (x == 3) {
            // Prints a final "Do" to complete the output pattern
            System.out.print("Do");
        }
    }
}
