/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11.ExtraWork;

/**
 *
 * @author Admin
 */
public class StaticTests extends StaticSuper {

    // A static field — like the static block, this belongs to the
    // CLASS, not to any individual object. There's only ever one
    // `rand` shared across every StaticTests object you ever create.
    static int rand;

    // This subclass's own static block. Static blocks run top-to-bottom
    // through the inheritance chain, superclass first, the FIRST time
    // the JVM needs this class — which in this program is right when
    // main() starts, since main() itself lives inside this class.
    static {
        rand = (int) (Math.random() * 6);
        System.out.println("static block " + rand);
    }

    StaticTests() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        // By the time you reach this line, BOTH static blocks (super's
        // and this class's) have already run — static blocks always
        // fire before main()'s body starts executing, because just
        // loading the StaticTests class to find main() triggers them.
        System.out.println("in main");

        // NOW constructors get involved. Just like static blocks,
        // construction goes superclass-first: Java always finishes
        // building the "super" part of an object before it builds the
        // "sub" part on top of it. You can't have a StaticTests without
        // first fully having a StaticSuper underneath it.
        StaticTests st = new StaticTests();
    }
}