/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_09.ExtraWork;

/**
 *
 * @author Admin
 */
public class Honey {

    // Constructor runs whenever a new Honey object is created
    public Honey() {
        System.out.println("Honey object created");
    }

    public static void main(String[] args) {

        System.out.println("=== Starting Program ===\n");

        // Create a single Honey object
        Honey honeyPot = new Honey();

        // Create an array containing four references
        // to the SAME Honey object
        Honey[] ha = {
            honeyPot, honeyPot,
            honeyPot, honeyPot
        };

        System.out.println(
                "\nCreated Honey array with 4 references to the same Honey object.");

        // Create a Bees object
        Bees bees = new Bees();

        // Assign the Honey array to the Bees object
        bees.beeHoney = ha;

        System.out.println("Assigned Honey array to Bees object.");

        // Create an array that can hold five Bear objects
        Bear[] bears = new Bear[5];

        // Create five Bear objects
        for (int i = 0; i < 5; i++) {

            bears[i] = new Bear();

            // Each Bear references the same Honey object
            bears[i].hunny = honeyPot;

            System.out.println(
                    "Bear #" + (i + 1)
                    + " now references the Honey object."
            );
        }

        // Create a Kit object
        Kit kit = new Kit();

        // Give the Kit a reference to the Honey object
        kit.honey = honeyPot;

        System.out.println("\nKit now references the Honey object.");

        // Create a Raccoon object
        Raccoon raccoon = new Raccoon();

        // Raccoon references the Honey object
        raccoon.rh = honeyPot;

        // Raccoon references the Kit object
        raccoon.rk = kit;

        System.out.println("Raccoon references the Honey object.");
        System.out.println("Raccoon also references the Kit object.");

        // Remove the local variable's reference to the Kit object
        System.out.println("\nSetting kit = null...");
        kit = null;

        // The Kit object is NOT eligible for garbage collection
        // because raccoon.rk still refers to it
        System.out.println("The Kit object is NOT garbage collectible.");
        System.out.println("Reason: raccoon.rk still references it.");

        System.out.println("\n=== End of main() ===");
    }
}

// Represents a swarm of bees
class Bees {

    // Reference to an array of Honey objects
    Honey[] beeHoney;

    public Bees() {
        System.out.println("Bees object created");
    }
}

// Represents a bear
class Bear {

    // Reference to a Honey object
    Honey hunny;

    public Bear() {
        System.out.println("Bear object created");
    }
}

// Represents a kit (baby raccoon)
class Kit {

    // Reference to a Honey object
    Honey honey;

    public Kit() {
        System.out.println("Kit object created");
    }
}

// Represents a raccoon
class Raccoon {

    // Reference to a Honey object
    Honey rh;

    // Reference to a Kit object
    Kit rk;

    public Raccoon() {
        System.out.println("Raccoon object created");
    }
}