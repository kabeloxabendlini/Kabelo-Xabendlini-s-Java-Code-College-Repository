/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_10;

/**
 *
 * @author Admin
 */
public class Song {

    String title;

    public Song(String t) {
        title = t;
    }

    public void play() {
        SoundPlayer player = new SoundPlayer();
        player.playSound(title);
    }
}
