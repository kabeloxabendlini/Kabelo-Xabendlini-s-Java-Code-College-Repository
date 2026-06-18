/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_01.ExtraWork;

/**
 *
 * @author Admin
 */
class Shuffle1 {
    public static void main(String[] args) {

        // Declare and initialize x with value 3, used as the loop counter
        int x = 3;

        // Loop continues as long as x is greater than 0
        while (x > 0) {

            // Only prints "a" on the first iteration when x is still 3
            if (x > 2) {
                System.out.print("a");
            }

            // Decrement x by 1, then print a dash separator
            x = x - 1;
            System.out.print("-");

            // Only prints "b c" on the first iteration after x is decremented to 2
            if (x == 2) {
                System.out.print("b c");
            }

            // Only prints "d" when x is 1, then decrements x to 0 to exit the loop
            if (x == 1) {
                System.out.print("d");
                x = x - 1; // Setting x to 0 causes the while condition to fail, ending the loop
            }
        }
    }
}