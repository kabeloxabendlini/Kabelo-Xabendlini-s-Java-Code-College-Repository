/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12;

/**
 *
 * @author Admin
 */
import java.util.List;

public class SongTestDrive {
    public static void main(String[] args) {
        // Songs is just a "data source" — building one and calling
        // getSongs() is the only way to get at the playlist data.
        Songs songsData = new Songs();
        List<Song> playlist = songsData.getSongs();

        // Looping over the List and printing each Song relies on the
        // toString() override you wrote — without it, this would print
        // a wall of useless memory-address-style strings instead of
        // readable song info.
        for (Song s : playlist) {
            System.out.println(s);
        }
    }
}