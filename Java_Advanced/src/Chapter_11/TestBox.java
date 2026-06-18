/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11;

/**
 *
 * @author Admin
 */
public class TestBox {

    private Integer i = 0;
    private int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go() {
        i = 10;

        j = i;

        System.out.println(j);
        System.out.println(i);
    }
}
