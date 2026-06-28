/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_17;

/**
 *
 * @author Admin
 */
public class ShortJob implements Runnable {

    private String name;

    public ShortJob(String name) {
        this.name = name;
    }

    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
        }
    }
}