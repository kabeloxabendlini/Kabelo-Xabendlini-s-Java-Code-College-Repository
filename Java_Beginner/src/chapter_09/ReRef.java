/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_09;

/**
 *
 * @author Admin
 */
public class ReRef {

    Duck d = new Duck();

    public void go() {
        d = new Duck();
    }
}

//public class ReRef {
// Duck d = new Duck();
// public void go() {
// d = null;
// }
//}
