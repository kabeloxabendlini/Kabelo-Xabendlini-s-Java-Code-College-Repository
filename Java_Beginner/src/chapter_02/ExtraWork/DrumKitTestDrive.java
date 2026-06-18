/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_02.ExtraWork;

/**
 *
 * @author Admin
 */
// DrumKit class represents a drum kit with a snare and top hat
// DrumKitTestDrive class is used to test the DrumKit class
public class DrumKitTestDrive {

    // Main method - entry point of the program
    public static void main(String[] args) {

        // Create a DrumKit object
        DrumKit d = new DrumKit();

        // Play the snare drum if it is available
        if (d.snare == true) {
            d.playSnare();
        }

        // Disable the snare drum
        d.snare = false;

        // Play the top hat cymbal if it is available
        if (d.topHat == true) {
            d.playTopHat();
        }
    }
}
