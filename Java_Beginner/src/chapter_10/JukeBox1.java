/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_10;

/**
 *
 * @author Admin
 */
import java.util.*;

public class JukeBox1 {

    public static void main(String[] args) {
        new JukeBox1().go();
    }

    public void go() {
        List<String> songList = MockSongs.getSongStrings();
        System.out.println(songList);
    }
}
// Below is the "mock" code. A stand in for the actual
// I/O code that the other programmer will provide later
