/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_04.ExtraWork;

/**
 *
 * @author Admin
 */
/*
 * Puzzle4 class
 * Creates an array of Value objects, assigns increasing powers of 10
 * to each object, performs calculations using the doStuff() method,
 * and accumulates the results.
 */
public class Puzzle4 {

    public static void main(String[] args) {

        // Create an array that can hold 6 Value objects
        Value[] values = new Value[6];

        // Starting number that will be stored in the objects
        int number = 1;

        // Loop counter
        int i = 0;

        // Create and initialize each Value object
        while (i < 6) {

            // Create a new Value object
            values[i] = new Value();

            // Store the current number in the object
            values[i].intValue = number;

            // Increase the number by a factor of 10
            // 1 → 10 → 100 → 1000 → 10000 → 100000
            number = number * 10;

            // Move to the next array position
            i = i + 1;
        }

        // Variable used to accumulate the final answer
        int result = 0;

        // Start at the end of the array
        i = 6;

        // Process the Value objects in reverse order
        while (i > 0) {

            // Move to the previous element
            i = i - 1;

            // Call doStuff() on the current object
            // and add the returned value to result
            result = result + values[i].doStuff(i);
        }

        // Display the final result
        System.out.println("result " + result);
    }
}
