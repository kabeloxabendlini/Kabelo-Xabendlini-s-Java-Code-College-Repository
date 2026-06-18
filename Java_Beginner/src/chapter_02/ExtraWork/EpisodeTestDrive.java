/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_02.ExtraWork;

/**
 *
 * @author Admin
 */
public class EpisodeTestDrive {

    public static void main(String[] args) {

        // Create a new Episode object
        Episode episode = new Episode();

        // Set the series (season) number
        episode.seriesNumber = 4;

        // Call the play() method
        // Since episodeNumber was never assigned,
        // it uses the default int value of 0
        episode.play();

        // Call the skipIntro() method
        episode.skipIntro();
    }
}
