/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_04;

/**
 *
 * @author Admin
 */
/*
 * Puzzle4 class
 * Creates an array of Value objects, assigns increasing powers of 10
 * to each object, performs calculations using the doStuff() method,
 * and accumulates the results.
 */
public class Puzzle4 {

    public static void main(String[] args) {

        Value[] values = new Value[6];
        int number = 1;
        int i = 0;

        while (i < 6) {
            values[i] = new Value();
            values[i].intValue = number;
            number = number * 10;
            i = i + 1;
        }

        int result = 0;
        i = 6;

        while (i > 0) {
            i = i - 1;
            result = result + values[i].doStuff(i);
        }

        System.out.println("result " + result);
    }
}
