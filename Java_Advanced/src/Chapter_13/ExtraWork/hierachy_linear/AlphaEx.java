/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13.ExtraWork.hierachy_linear;

/**
 *
 * @author Admin
 */

// This is a separate exercise from the hierachy_branching package —
// same class names (AlphaEx, BetaEx, ...) but living in a different
// package, so there's no conflict with the earlier ones. Given the
// "linear" name, I'd expect this chain to be a single straight line
// down to Exception, without any branching subclasses off to the side
// like the earlier hierarchy might have had.
public class AlphaEx extends BetaEx {

    public AlphaEx() {
    }

    public AlphaEx(String message) {
        super(message);
    }
}