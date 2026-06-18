/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_05.ExtraWork;

/**
 *
 * @author Admin
 */
public class Output {

    public static void main(String[] args) {

        // Create an Output object
        Output output = new Output();

        // Call the go() method
        output.go();
    }

    void go() {

        // Initialize value to 7
        int value = 7;

        // Loop from 1 through 7
        for (int i = 1; i < 8; i++) {

            // Increase value by 1 each iteration
            value++;

            // Once i is greater than 4,
            // increment value again and print it
            if (i > 4) {
                System.out.print(++value + " ");
            }

            // If value becomes greater than 14,
            // print the current value of i and exit the loop
            if (value > 14) {
                System.out.println(" i = " + i);
                break;
            }
        }
    }
}