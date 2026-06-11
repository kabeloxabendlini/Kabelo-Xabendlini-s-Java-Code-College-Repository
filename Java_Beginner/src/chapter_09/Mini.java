/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_09;

/**
 *
 * @author Admin
 */
import java.awt.Color;

class Mini extends Car {

    private Color color;

    public Mini() {
        this(Color.RED);
    }

    public Mini(Color c) {
        super("Mini");
        color = c;
        // more initialization
    }

    // Fix — just chain to this() only:
    public Mini(int size) {
        this(Color.RED);  // that's enough
    }
}
