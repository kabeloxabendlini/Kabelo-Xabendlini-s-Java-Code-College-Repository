/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_02.ExtraWork;

/**
 *
 * @author Admin
 */
public class StreamingSong {

    // Stores the title of the song
    String title;

    // Stores the artist's name
    String artist;

    // Stores the song's duration in seconds
    int duration;

    // Simulates playing the song
    void play() {

        // Display a message indicating the song is playing
        System.out.println("Playing song");
    }

    // Displays information about the song
    void printDetails() {

        // Print the song title and artist
        System.out.println("This is " + title
                + " by " + artist);
    }
}