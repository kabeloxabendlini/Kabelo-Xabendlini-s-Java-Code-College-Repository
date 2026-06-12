/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_10;

/**
 *
 * @author Admin
 */
import java.util.List;

public class TestSongs {

    public static void main(String[] args) {

        List<String> songs = MockSongs.getSongStrings();

        for (String song : songs) {
            System.out.println(song);
        }
    }
}
