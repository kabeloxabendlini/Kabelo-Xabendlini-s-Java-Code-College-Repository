/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_05.ExtraWork;

/**
 *
 * @author Admin
 */
//The original code is:
//public class MultiFor {
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 4; i++) {
//
//            for (int j = 4; j > 2; j--) {
//                System.out.println(i + " " + j);
//            }
//
//            if (i == 1) {
//                i++;
//            }
//        }
//    }
//}
//What if the if block came before the j loop?
public class MultiFor {

    public static void main(String[] args) {

        // Outer loop:
        // Starts with i = 0 and continues while i < 4
        for (int i = 0; i < 4; i++) {

            // If i equals 1, increase it by 1
            // This causes i = 1 to become i = 2
            if (i == 1) {
                i++;
            }

            // Inner loop:
            // Starts with j = 4 and counts down to 3
            for (int j = 4; j > 2; j--) {

                // Print the current values of i and j
                System.out.println(i + " " + j);
            }
        }
    }
}
