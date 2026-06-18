/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_08.ExtraWork;

/**
 *
 * @author Admin
 */
public class Of76 extends Clowns {

    public static void main(String[] args) {

        // Create an array that can hold three objects
        // that implement the Nose interface
        Nose[] i = new Nose[3];

        // Store an Acts object in the first element
        i[0] = new Acts();

        // Store a Clowns object in the second element
        i[1] = new Clowns();

        // Store an Of76 object in the third element
        i[2] = new Of76();

        // Loop through each element in the array
        for (int x = 0; x < 3; x++) {

            // Call the iMethod() method on the current object
            // and print its return value

            // getClass() returns the actual class of the object
            // currently stored in the array element

            System.out.println(
                i[x].iMethod() + " " + i[x].getClass()
            );
        }
    }
}