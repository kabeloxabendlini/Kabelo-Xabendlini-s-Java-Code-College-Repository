/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_02.ExtraWork;

/**
 *
 * @author Admin
 */
public class StreamingSongTestDrive {

    public static void main(String[] args) {

        // Create a new StreamingSong object
        StreamingSong song = new StreamingSong();

        // Set the artist's name
        song.artist = "The Beatles";

        // Set the song title
        song.title = "Come Together";

        // Call the play() method
        song.play();

        // Display the song's details
        song.printDetails();
    }
}
