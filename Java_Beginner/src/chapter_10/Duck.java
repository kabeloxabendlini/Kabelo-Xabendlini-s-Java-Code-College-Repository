/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_10;

/**
 *
 * @author Admin
 */
public class Duck {

    private int size;

    public static void main(String[] args) {
        Duck d = new Duck();
        d.setSize(42);

        System.out.println("Size is " + d.getSize());
    }

    public void setSize(int s) {
        size = s;
    }

    public int getSize() {
        return size;
    }
}
