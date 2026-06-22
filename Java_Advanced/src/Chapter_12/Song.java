/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12;

/**
 *
 * @author Admin
 */
public class Song {

    private final String title;
    private final String artist;
    private final String genre;
    private final int year;
    private final int timesPlayed;

    // The constructor — the ONLY place these five `final` fields can
    // ever be assigned. Parameter order matches exactly how Songs.java
    // calls it: new Song(title, artist, genre, year, timesPlayed). If
    // you ever reorder these parameters, every call in Songs.java would
    // silently pass values into the wrong fields without the compiler
    // catching it (since they're all String/String/String/int/int) —
    // so keep this order locked in once it's set.
    public Song(String title, String artist, String genre, int year, int timesPlayed) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.timesPlayed = timesPlayed;
    }

    // Getters — since all five fields are private, this is the only
    // way other classes (like whatever eventually prints or filters
    // this playlist) can read these values. No setters exist, on
    // purpose: these fields are final, so there's nothing a setter
    // could legally change anyway.
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getTimesPlayed() {
        return timesPlayed;
    }

    // Same role as Mountain's toString() — without this, printing a
    // Song (or a List<Song> that contains one) would just produce
    // something like "Chapter_12.Song@1b6d3586" instead of anything
    // useful.
    @Override
    public String toString() {
        return title + " by " + artist + " (" + genre + ", " + year + ") - played " + timesPlayed + " times";
    }
}
