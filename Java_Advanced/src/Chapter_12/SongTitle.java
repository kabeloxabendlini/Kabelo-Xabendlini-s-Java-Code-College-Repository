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
import java.util.stream.Collectors;

public class SongTitle {
    public static void main(String[] args) {
        Songs songsData = new Songs();
        List<Song> allSongs = songsData.getSongs();

        for (Song s : allSongs) {
            System.out.println(s);
        }

        // A Stream pipeline: instead of writing a manual for-loop with
        // if-statements, you describe WHAT result you want and let the
        // stream figure out how to get there. Each step below passes
        // its output to the next step in the chain.
        String songTitle = "With a Little Help from My Friends";

        List<String> result = allSongs.stream()
                // Keep only Song objects whose title matches exactly.
                // There are two songs with this exact title in your
                // dataset — The Beatles' original and Joe Cocker's
                // cover — so both survive this first filter.
                .filter(song -> song.getTitle().equals(songTitle))
                // Transform each surviving Song into just its artist
                // name (a String) — from here on, the stream is no
                // longer carrying Song objects, just Strings.
                .map(song -> song.getArtist())
                // Now filter the ARTIST NAMES themselves, excluding
                // "The Beatles" specifically. This is why the result
                // ends up containing only "Joe Cocker" — The Beatles'
                // version got filtered out at this second stage, even
                // though it passed the first filter.
                .filter(artist -> !artist.equals("The Beatles"))
                // Collect everything that survived both filters into
                // an actual List<String> you can use afterward — up to
                // this point it's all been a lazy, unevaluated pipeline.
                .collect(Collectors.toList());

        System.out.println("Artists (excluding The Beatles) who performed \""
                + songTitle + "\": " + result);
    }
}