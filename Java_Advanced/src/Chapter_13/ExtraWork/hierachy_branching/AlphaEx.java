/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13.ExtraWork.hierachy_branching;

/**
 *
 * @author Admin
 */

// AlphaEx sits one level below BetaEx in a custom exception hierarchy.
// It inherits whatever exception behavior BetaEx already has (and, in
// turn, whatever BetaEx inherited from Exception) — this class adds no
// new fields or logic of its own, just two constructors.
public class AlphaEx extends BetaEx {

    // The no-arg constructor. Doesn't explicitly call super(...), but
    // Java automatically inserts a call to BetaEx's no-arg constructor
    // here regardless — every constructor's first move, written or not,
    // is to make sure the superclass is fully built first.
    public AlphaEx() {
    }

    // This constructor accepts a custom error message and explicitly
    // passes it UP to BetaEx's constructor via super(message). This
    // only works if BetaEx itself has a matching constructor that takes
    // a String — otherwise this line won't compile. The message
    // eventually lands in Exception's own internal field, which is what
    // getMessage() reads from later.
    public AlphaEx(String message) {
        super(message);
    }
}