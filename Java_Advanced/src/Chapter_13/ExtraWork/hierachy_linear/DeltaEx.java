/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13.ExtraWork.hierachy_linear;

/**
 *
 * @author Admin
 */

// DeltaEx extends Exception directly — the root of this "linear" chain,
// same role as DeltaEx played in the branching package earlier. Once
// GammaEx extends DeltaEx, the full lineage here will be:
// AlphaEx -> BetaEx -> GammaEx -> DeltaEx -> Exception.
public class DeltaEx extends Exception {

    // No-arg constructor — auto-calls Exception's no-arg constructor.
    public DeltaEx() {
    }

    // Final relay point: this calls Exception's own String constructor
    // directly, which is where the message actually gets stored
    // internally for getMessage() to retrieve later.
    public DeltaEx(String message) {
        super(message);
    }
}