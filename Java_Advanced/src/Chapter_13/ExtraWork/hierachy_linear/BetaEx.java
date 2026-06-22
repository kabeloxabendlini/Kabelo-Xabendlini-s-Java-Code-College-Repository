/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13.ExtraWork.hierachy_linear;

/**
 *
 * @author Admin
 */

// BetaEx extends GammaEx, continuing this chain. Note: this file's
// package is `hierarchy_linear` directly — no `Chapter_13.ExtraWork.`
// prefix — and it's missing the file-template header comment and
// @author javadoc the rest of your files have. If this is meant to sit
// in the same project structure as your other exercises, double-check
// that the folder on disk actually matches this package declaration
// exactly, or NetBeans will throw a package-mismatch error on build.

public class BetaEx extends GammaEx {

    // No-arg constructor — Java auto-calls GammaEx's no-arg constructor
    // before this body runs, same as every other class in this chain.
    public BetaEx() {
    }

    // Relays the message one level up to GammaEx, continuing the chain
    // toward Exception's message field.
    public BetaEx(String message) {
        super(message);
    }
}