/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13.ExtraWork;

/**
 *
 * @author Admin
 */

// A custom checked exception. It adds no new fields or methods of its
// own — its only purpose is to give us a more specific, meaningful
// exception type than just throwing a generic Exception. Extending
// Exception (not RuntimeException) makes this a CHECKED exception,
// which is why doRisky() below has to declare "throws MyEx".
class MyEx extends Exception {
}

public class ExTestDrive {
    public static void main(String[] args) {
        // If you run this with a command-line argument, args[0] is used.
        // Otherwise it defaults to "yes". This is what decides whether
        // the exception actually gets thrown below.
        String test = (args.length > 0) ? args[0] : "yes";

        try {
            System.out.print("t");
            // If doRisky() throws MyEx, execution jumps STRAIGHT to the
            // catch block — the rest of the try block (the "o" print)
            // never runs.
            doRisky(test);
            System.out.print("o");
        } catch (MyEx e) {
            System.out.print("a");
        } finally {
            // finally ALWAYS runs — whether the try block finished
            // cleanly, or an exception was thrown and caught, or even
            // (in other cases) if the exception was never caught at
            // all. It's the one block you can count on executing no
            // matter what happened above it.
            System.out.print("w");
        }
        System.out.println("s");
    }

    // "throws MyEx" in the method signature is Java forcing you to be
    // honest: this method might fail in a specific, named way, and
    // whoever calls it must either catch that or pass the obligation
    // further up the chain. That's the deal with checked exceptions.
    static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if ("yes".equals(t)) {
            // Throwing here immediately exits doRisky() — the "r" print
            // below is skipped entirely, and control jumps back to
            // whichever try block called this method.
            throw new MyEx();
        }
        System.out.print("r");
    }
}