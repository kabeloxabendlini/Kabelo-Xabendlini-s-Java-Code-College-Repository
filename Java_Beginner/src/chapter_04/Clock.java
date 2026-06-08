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
 * Clock class
 * Represents a simple clock that stores and returns a time value.
 */
class Clock {

    // Stores the current time as a String
    String time;

    /*
     * Sets the clock's time.
     *
     * @param t the time to store
     */
    void setTime(String t) {
        time = t;
    }

    /*
     * Returns the current time stored in the clock.
     *
     * @return the clock's time
     */
    String getTime() {
        return time;
    }
}
