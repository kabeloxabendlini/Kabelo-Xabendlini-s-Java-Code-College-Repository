/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_04.ExtraWork;

/**
 *
 * @author Admin
 */
/*
 * ClockTestDrive class
 * Creates a Clock object, sets a time, retrieves it,
 * and displays it on the screen.
 */
class ClockTestDrive {

    public static void main(String[] args) {

        // Create a new Clock object
        Clock c = new Clock();

        // Set the time on the clock
        c.setTime("1245");

        // Retrieve the time from the clock
        String tod = c.getTime();

        // Display the time
        System.out.println("time: " + tod);
    }
}
