/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13.ExtraWork.hierachy_branching;

/**
 *
 * @author Admin
 */

// DeltaEx extends Exception directly — this is the ROOT of this
// particular branch, not a continuation of the AlphaEx -> BetaEx chain.
// So if GammaEx extends DeltaEx, the full lineage would be:
// AlphaEx -> BetaEx -> GammaEx -> DeltaEx -> Exception. Worth
// double-checking that's actually how GammaEx is declared once you
// share it, since this file on its own doesn't confirm the link.
public class DeltaEx extends Exception {

    // No-arg constructor. Java automatically calls Exception's no-arg
    // constructor here, since nothing else is specified.
    public DeltaEx() {
    }

    // super(message) here calls Exception's own String constructor
    // directly — this is the final relay point. Exception stores the
    // message internally, and getMessage() (callable from anywhere in
    // the chain, even AlphaEx) reads it from there.
    public DeltaEx(String message) {
        super(message);
    }
}