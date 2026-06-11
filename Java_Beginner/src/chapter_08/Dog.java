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
 * Dog class
 * Represents a dog with a name and size.
 * The dog's bark changes depending on its size.
 */
class Dog {

    // Stores the size of the dog
    int size;

    // Stores the name of the dog
    String name;

    /*
     * Makes the dog bark.
     * Large dogs bark loudly,
     * medium dogs bark normally,
     * and small dogs bark with a high-pitched sound.
     */
    void bark() {

        // Large dog
        if (size > 60) {
            System.out.println("Wooof! Wooof!");

            // Medium-sized dog
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");

            // Small dog
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
