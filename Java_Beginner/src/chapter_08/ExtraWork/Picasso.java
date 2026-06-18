/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_08.ExtraWork;

/**
 *
 * @author Admin
 */
// Picasso is an abstract class.
// Objects cannot be created directly from an abstract class.
//
// Picasso implements the Nose interface,
// so it must provide the iMethod() method
// (or remain abstract).
abstract class Picasso implements Nose {

    // Implementation of the iMethod() declared
    // in the Nose interface.
    // This version always returns 7.
    public int iMethod() {
        return 7;
    }
}
