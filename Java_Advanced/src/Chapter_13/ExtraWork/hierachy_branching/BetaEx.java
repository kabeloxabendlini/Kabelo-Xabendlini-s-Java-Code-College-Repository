/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13.ExtraWork.hierachy_branching;

/**
 *
 * @author Admin
 */

// BetaEx is the middle link in the chain: AlphaEx extends BetaEx, and
// BetaEx extends GammaEx. So the full lineage so far is
// AlphaEx -> BetaEx -> GammaEx -> (whatever GammaEx extends, presumably
// Exception). Same pattern as AlphaEx: no new behavior, just
// constructors that keep the chain intact.
public class BetaEx extends GammaEx {

    // No-arg constructor. Java silently calls GammaEx's no-arg
    // constructor first, before anything in this constructor's (empty)
    // body runs — same automatic super-call rule as always.
    public BetaEx() {
    }

    // Passes the message one level further up to GammaEx. This only
    // compiles if GammaEx has a constructor that accepts a String —
    // each class in the chain needs to "relay" the message upward for
    // it to eventually reach Exception's own message field at the top.
    public BetaEx(String message) {
        super(message);
    }
}