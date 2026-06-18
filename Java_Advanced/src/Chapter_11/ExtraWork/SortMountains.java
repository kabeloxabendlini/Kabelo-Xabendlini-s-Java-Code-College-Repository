/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.ExtraWork;

/**
 *
 * @author Admin
 */
import java.util.*;

public class SortMountains {

    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go() {
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Longs", 14255));
        mountains.add(new Mountain("Elbert", 14433));
        mountains.add(new Mountain("Maroon", 14156));
        mountains.add(new Mountain("Castle", 14265));
        System.out.println("as entered:\n" + mountains);
        mountains.sort((mount1, mount2) -> mount1.name.compareTo(mount2.name));
        System.out.println("by name:\n" + mountains);
        mountains.sort((mount1, mount2) -> mount2.height - mount1.height);
        System.out.println("by height:\n" + mountains);
    }
}
