/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.ExtraWork;

/**
 *
 * @author Admin
 */

// A simple data-holder class. Its only job is to represent a single
// mountain — a name and a height — and nothing more. No behavior beyond
// constructing itself and describing itself as a String.
class Mountain {

    // Instance variables: every Mountain object gets its OWN copy of
    // these. They live as long as the object lives, unlike local
    // variables which disappear when a method ends.
    String name;
    int height;

    // Constructor: runs once, automatically, when you write
    // `new Mountain("Kilimanjaro", 5895)`. Its job is to take whatever
    // was passed in and store it on THIS particular object.
    Mountain(String name, int height) {
        // `this.name` refers to the instance variable above.
        // `name` (no "this.") refers to the parameter that was just
        // passed in. Without "this.", Java can't tell them apart since
        // they share the same name — "this." is how you point at "the
        // field that belongs to me" instead of "the local parameter".
        this.name = name;
        this.height = height;
    }

    // Overriding toString() means that any time this object is printed
    // — e.g. System.out.println(myMountain) — Java calls THIS method
    // automatically instead of the default Object version (which just
    // prints something useless like "Mountain@1b6d3586").
    public String toString() {
        return name + " " + height;
    }
}