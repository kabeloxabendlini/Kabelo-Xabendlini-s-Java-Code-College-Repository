/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_02.ExtraWork;

/**
 *
 * @author Admin
 */
public class EchoTestDrive {

    public static void main(String[] args) {

        // Create the first Echo object
        Echo e1 = new Echo();

        // Create the second Echo object
        Echo e2 = new Echo(); // correct answer

        // BONUS ANSWER:
        // If e2 = e1, both variables would refer
        // to the same Echo object.
        // Echo e2 = e1;

        // Loop counter
        int x = 0;

        // Repeat while x is less than 4
        while (x < 4) {

            // Call the hello() method on e1
            e1.hello();

            // Increase e1's count by 1
            e1.count = e1.count + 1;

            // On the last iteration (x == 3),
            // increase e2's count by 1
            if (x == 3) {
                e2.count = e2.count + 1;
            }

            // Starting with the second iteration,
            // add e1's count to e2's count
            if (x > 0) {
                e2.count = e2.count + e1.count;
            }

            // Move to the next loop iteration
            x = x + 1;
        }

        // Display the final value of e2.count
        System.out.println(e2.count);
    }
}