/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_02;

/**
 *
 * @author Admin
 */
// DrumKit class represents a drum kit with a snare and top hat
public class DrumKit {

    // Instance variables representing drum parts
    boolean topHat = true;
    boolean snare = true;

    // Method to play the snare drum
    void playSnare() {
        System.out.println("bang bang ba-bang");
    }

    // Method to play the top hat cymbal
    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
}