/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_02.ExtraWork;

/**
 *
 * @author Admin
 */
public class Episode {

    // Stores the season (or series) number
    int seriesNumber;

    // Stores the episode number within the season
    int episodeNumber;

    // Simulates playing the episode
    void play() {

        // Display the episode number being played
        System.out.println("Playing episode " + episodeNumber);
    }

    // Simulates skipping the introduction
    void skipIntro() {

        // Display a message indicating the intro is skipped
        System.out.println("Skipping intro...");
    }

    // Simulates loading the next episode
    void skipToNext() {

        // Display a message indicating the next episode is loading
        System.out.println("Loading next episode...");
    }
}