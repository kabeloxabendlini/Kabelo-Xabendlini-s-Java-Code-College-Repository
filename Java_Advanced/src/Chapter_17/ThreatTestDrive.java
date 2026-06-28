/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_17;

/**
 *
 * @author Admin
 */
class ThreadTestDrive {

    public static void main(String[] args) {
        Thread myThread = new Thread(()
                -> System.out.println("top o’ the stack"));
        myThread.start();
        System.out.println("back in main");
    }
}
