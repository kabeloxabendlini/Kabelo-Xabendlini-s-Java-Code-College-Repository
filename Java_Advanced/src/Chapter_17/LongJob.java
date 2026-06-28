/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_17;

/**
 *
 * @author Admin
 */

public class LongJob implements Runnable {

    private String name;

    public LongJob(String name) {
        this.name = name;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000); // pretend each step takes a second
            }
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
        }
    }
}
