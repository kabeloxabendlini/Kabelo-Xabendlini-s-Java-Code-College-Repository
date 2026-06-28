/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_17;

/**
 *
 * @author Admin
 */
public class RunTester {

    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();

        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println(Thread.currentThread().getName()
                + ": back in main");

        Thread.dumpStack();
    }

}
