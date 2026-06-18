/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11;

/**
 *
 * @author Admin
 */
// This class demonstrates different ways
// the 'final' keyword can be used.
class Foof {

    // A final instance variable.
    // It is initialized when declared and
    // cannot be changed afterward.
    final int size = 3;

    // A blank final variable.
    // It must be assigned exactly once,
    // usually in the constructor.
    final int whuffie;

    // Constructor
    Foof() {

        // Assign a value to the blank final variable.
        // After this assignment, whuffie can never
        // be assigned another value.
        whuffie = 42;
    }

    // The parameter x is final.
    // It can be used inside the method,
    // but its value cannot be changed.
    void doStuff(final int x) {

        // The following would cause a compile error:
        // x = 10;
        // You can use x, but you cannot modify it.
    }

    void doMore() {

        // A final local variable.
        // It is assigned once and cannot
        // be changed afterward.
        final int z = 7;

        // The following would cause a compile error:
        // z = 8;
    }
}
