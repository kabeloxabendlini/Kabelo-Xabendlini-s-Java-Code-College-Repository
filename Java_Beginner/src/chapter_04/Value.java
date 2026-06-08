/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_04;

/**
 *
 * @author Admin
 */
class Value {

    int intValue;

    public int doStuff(int factor) {

        if (intValue > 100) {
            return intValue * factor;
        } else {
            return intValue * (5 - factor);
        }
    }
}