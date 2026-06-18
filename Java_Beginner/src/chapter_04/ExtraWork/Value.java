/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_04.ExtraWork;

/**
 *
 * @author Admin
 */
public class Value {

    // Instance variable that stores a number
    int intValue;

    // Method that performs a calculation based on the value
    // stored in intValue and the factor passed as an argument
    public int doStuff(int factor) {

        // Check whether intValue is greater than 100
        if (intValue > 100) {

            // If it is greater than 100,
            // multiply intValue by the factor
            return intValue * factor;

        } else {

            // Otherwise, multiply intValue by
            // (5 - factor) and return the result
            return intValue * (5 - factor);
        }
    }
}
