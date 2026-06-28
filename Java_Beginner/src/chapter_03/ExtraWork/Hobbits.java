/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_03.ExtraWork;

/**
 *
 * @author Admin
 */
public class Hobbits {

    String name; // instance variable -- each Hobbits object gets its own 'name'

    public static void main(String[] args) {

        Hobbits[] h = new Hobbits[3]; // declare an array that can hold 3 Hobbits objects
                                       // (the array itself exists now, but all 3 slots
                                       // are empty/null until we create objects below)

        int z = -1; // start at -1 so that after the first "z = z + 1" below, z becomes 0
                    // (arrays are zero-indexed, so the first slot is h[0], not h[1])

        while (z < 2) {              // keep looping while z is less than 2
                                       // (this lets z take the values 0, 1, and 2 -- three
                                       // passes through the loop, one per array slot)

            z = z + 1;                // increment z first, so on pass 1 z becomes 0,
                                       // pass 2 z becomes 1, pass 3 z becomes 2

            h[z] = new Hobbits();     // create a new Hobbits object and store it in slot z
            h[z].name = "bilbo";      // give every Hobbit the default name "bilbo" first

            if (z == 1) {              // then overwrite the name for slot 1...
                h[z].name = "frodo";
            }
            if (z == 2) {              // ...and overwrite the name for slot 2
                h[z].name = "sam";
            }
            // slot 0 never matches either if, so h[0].name is left as "bilbo"

            System.out.print(h[z].name + " is a ");  // print without a line break
            System.out.println("good Hobbit name");  // finish the line and move to the next
        }
        // Expected output after all 3 passes:
        // bilbo is a good Hobbit name
        // frodo is a good Hobbit name
        // sam is a good Hobbit name
    }
}