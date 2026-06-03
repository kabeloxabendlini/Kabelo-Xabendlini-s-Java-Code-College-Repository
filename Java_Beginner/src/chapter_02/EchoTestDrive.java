/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_02;

/**
 *
 * @author Admin
 */
public class EchoTestDrive {

    public static void main(String[] args) {

        Echo e1 = new Echo();
        Echo e2 = new Echo(); // correct answer

        // OR (bonus answer)
        // Echo e2 = e1;

        int x = 0;

        while (x < 4) {
            e1.hello();
            e1.count = e1.count + 1;

            if (x == 3) {
                e2.count = e2.count + 1;
            }

            if (x > 0) {
                e2.count = e2.count + e1.count;
            }

            x = x + 1;
        }

        System.out.println(e2.count);
    }
}