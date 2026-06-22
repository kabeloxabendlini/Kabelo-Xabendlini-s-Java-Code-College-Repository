/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12.ExtraWork;

/**
 *
 * @author Admin
 */
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import Chapter_12.Song;
import Chapter_12.Songs;

class SongSearch {

    // Using the real Songs class from Chapter_12 here — not
    // JukeboxData.Songs, since that class doesn't exist on your end.
    private final List<Song> songs = new Songs().getSongs();

    void printTopFiveSongs() {
        List<String> topFive = songs.stream()
                .sorted(Comparator.comparingInt(Song::getTimesPlayed))
                .map(song -> song.getTitle())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(topFive);
    }

    void search(String artist) {
        Optional<Song> result = songs.stream()
                .filter(song -> song.getArtist().equals(artist))
                .findFirst();
        if (result.isPresent()) {
            System.out.println(result.get().getTitle());
        } else {
            System.out.println("No songs found by: " + artist);
        }
    }
}