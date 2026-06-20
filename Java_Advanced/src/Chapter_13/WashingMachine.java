/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13;

/**
 *
 * @author Admin
 */
public class WashingMachine {
    public void go() {
        Laundry laundry = new Laundry();
        try {
            laundry.doLaundry();
        } catch (PantsException pex) {
            // recovery code
        } catch (LingerieException lex) {
            // recovery code
        }
    }   // <-- closes go()
}       // closes class