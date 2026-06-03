/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_01;

/**
 *
 * @author Admin
 */
public class BottleSong {

    public static void main(String[] args) {

        // Initialize bottle counter starting at 10
        int bottlesNum = 10;

        // Start with plural form of "bottles"
        String word = "bottles";

        // Loop continues until there are no bottles left
        while (bottlesNum > 0) {

            // Switch to singular "bottle" when only one remains
            if (bottlesNum == 1) {
                word = "bottle";
            }

            // Print the first two lines of the verse with the current bottle count
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");

            // Decrement the bottle count to reflect one falling
            bottlesNum = bottlesNum - 1;

            // Print the final line of the verse depending on how many bottles remain
            if (bottlesNum > 0) {
                // At least one bottle remains — print the updated count
                System.out.println("There'll be " + bottlesNum
                        + " green " + word + ", hanging on the wall");
            } else {
                // No bottles remain — print the final ending line
                System.out.println("There'll be no green bottles, hanging on the wall");
            }
        }
    }
}