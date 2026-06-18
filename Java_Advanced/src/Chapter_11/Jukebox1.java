/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11;

/**
 *
 * @author Admin
 */
import java.util.*;

public class Jukebox1 {

    public static void main(String[] args) {

        // Create a Jukebox1 object and call its go() method
        new Jukebox1().go();
    }

    public void go() {

        // Call the static method in MockSongs
        // to get a list of song titles
        List<String> songList = MockSongs.getSongStrings();

        // Print the entire list of songs
        System.out.println(songList);
    }
}
