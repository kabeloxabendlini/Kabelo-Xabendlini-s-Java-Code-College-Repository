/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.ExtraWork;

/**
 *
 * @author Admin
 */

// A simple superclass used to demonstrate the ORDER that Java runs
// things in: static initializer blocks vs constructors, and (once a
// subclass exists) superclass vs subclass.
class StaticSuper {

    // A static initializer block. This runs exactly ONCE per class —
    // not once per object — and it runs the very first time the JVM
    // loads this class into memory (e.g. the first time you create a
    // StaticSuper, or a subclass of it). Even if you create ten
    // StaticSuper objects, you'll only ever see "super static block"
    // printed once across the whole program.
    static {
        System.out.println("super static block");
    }

    // The constructor, by contrast, runs every single time you call
    // `new StaticSuper()`. So if you create three objects, you'll see
    // "super constructor" printed three times — but "super static
    // block" still only once, before any of them.
    StaticSuper() {
        System.out.println("super constructor");
    }
}