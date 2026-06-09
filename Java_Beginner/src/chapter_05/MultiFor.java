/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_05;

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
        for (int i = 0; i < 4; i++) {

            if (i == 1) {
                i++;
            }

            for (int j = 4; j > 2; j--) {
                System.out.println(i + " " + j);
            }
        }
    }
}