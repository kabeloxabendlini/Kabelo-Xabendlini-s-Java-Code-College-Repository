/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11;

/**
 *
 * @author Admin
 */
// Below is the "mock" code. A stand in for the actual
// I/O code that the other programmer will provide later
import java.util.ArrayList;
import java.util.List;

public class MockSongs {

    // Static method that creates and returns
    // a list of song titles
    public static List<String> getSongStrings() {

        // Create an ArrayList that can store String objects
        List<String> songs = new ArrayList<>();

        // Add song titles to the list
        songs.add("somersault");
        songs.add("cassidy");
        songs.add("$10");
        songs.add("havana");
        songs.add("Cassidy");
        songs.add("50 Ways");

        // Return the completed list of songs
        return songs;
    }
}
