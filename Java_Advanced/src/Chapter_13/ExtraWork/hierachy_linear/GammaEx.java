/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13.ExtraWork.hierachy_linear;

/**
 *
 * @author Admin
 */

// GammaEx slots between BetaEx and DeltaEx, completing the chain:
// AlphaEx -> BetaEx -> GammaEx -> DeltaEx -> Exception.
public class GammaEx extends DeltaEx {

    public GammaEx() {
    }

    public GammaEx(String message) {
        super(message);
    }
}