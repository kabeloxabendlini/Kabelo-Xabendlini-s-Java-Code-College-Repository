/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_06.ExtraWork;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class ArrayListMagnet {

    public static void main(String[] args) {

        // Create an ArrayList that stores String objects
        ArrayList<String> a = new ArrayList<String>();

        // Add four elements to the list
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");

        // Print the initial list
        printList(a);

        // Check whether the list contains "three"
        if (a.contains("three")) {

            // If found, add "four" to the end of the list
            a.add("four");
        }

        // Remove the element at index 2 ("two")
        a.remove(2);

        // Print the updated list
        printList(a);

        // Check whether "four" is NOT at index 4
        if (a.indexOf("four") != 4) {

            // Insert "4.2" at index 4
            a.add(4, "4.2");
        }

        // Print the updated list
        printList(a);

        // Check whether the list still contains "two"
        if (a.contains("two")) {

            // If it does, add "2.2" to the end
            a.add("2.2");
        }

        // Print the final list
        printList(a);
    }

    // Utility method that prints every element in the list
    public static void printList(ArrayList<String> list) {

        // Enhanced for loop to visit each element
        for (String element : list) {
            System.out.print(element + " ");
        }

        // Move to the next line after printing the list
        System.out.println();
    }
}