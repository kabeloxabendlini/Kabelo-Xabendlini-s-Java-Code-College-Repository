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
        // Create a throwaway SortMountains object just so we have an
        // instance to call go() on. main() is static, so it can't call
        // instance methods directly — it needs an object to do that.
        new SortMountains().go();
    }

    public void go() {
        // ArrayList<Mountain> — a resizable list that holds Mountain
        // objects. We use the List interface as the declared type
        // (good practice) but ArrayList as the actual implementation.
        List<Mountain> mountains = new ArrayList<>();

        mountains.add(new Mountain("Longs", 14255));
        mountains.add(new Mountain("Elbert", 14433));
        mountains.add(new Mountain("Maroon", 14156));
        mountains.add(new Mountain("Castle", 14265));

        // Printing the list directly works because ArrayList's own
        // toString() calls toString() on every element inside it —
        // which is exactly why we bothered overriding toString() in
        // Mountain. Without that override, this would print a list of
        // useless memory-address-style strings.
        System.out.println("as entered:\n" + mountains);

        // List.sort() takes a Comparator — something that knows how to
        // compare two Mountain objects and decide their order. Instead
        // of writing a separate Comparator class, this uses a lambda:
        // a compact, inline way of writing "given mount1 and mount2,
        // here's how to compare them."
        //
        // String's compareTo() returns negative/zero/positive depending
        // on alphabetical order, which is exactly the contract sort()
        // needs: negative means mount1 comes first, positive means
        // mount2 comes first, zero means they're equal.
        mountains.sort((mount1, mount2) -> mount1.name.compareTo(mount2.name));
        System.out.println("by name:\n" + mountains);

        // Same idea, but comparing the int heights directly instead of
        // calling a method. Note the order: mount2.height - mount1.height
        // (not the other way around) is what flips this into DESCENDING
        // order — tallest mountain first. If it were
        // mount1.height - mount2.height, you'd get shortest-first instead.
        mountains.sort((mount1, mount2) -> mount2.height - mount1.height);
        System.out.println("by height:\n" + mountains);
    }
}