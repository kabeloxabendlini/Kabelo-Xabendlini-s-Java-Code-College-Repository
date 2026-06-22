/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_14.ExtraWork;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Goal: a GUI with a single button that toggles its own label between
// "A" and "B" every time it's clicked.
class InnerButton {

    // The field has to live here, not as a local variable inside go(),
    // because ButtonListener (below) needs to read and change it every
    // time a click happens — long after go() has finished running.
    private JButton button;

    public static void main(String[] args) {
        InnerButton gui = new InnerButton();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        button = new JButton("A");

        // addActionListener() requires an object whose class implements
        // the ActionListener interface — ButtonListener does exactly
        // that below, so this object can legally be passed in here.
        button.addActionListener(new ButtonListener());

        frame.getContentPane().add(
                BorderLayout.SOUTH, button);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

    // An inner class — bound to a specific InnerButton instance, which
    // is exactly why it can reach the private `button` field directly
    // with no extra wiring needed.
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Every click flips the label: if it currently says "A",
            // switch to "B"; otherwise (it must say "B"), switch back
            // to "A". This is the whole toggle logic in one if/else.
            if (button.getText().equals("A")) {
                button.setText("B");
            } else {
                button.setText("A");
            }
        }
    }
    // Reminder for next time you see this pattern: ActionListener is an
    // interface, not a class — that's why ButtonListener uses
    // "implements" above, never "extends". Interfaces define a contract
    // of methods to fulfill; they have no implementation to inherit.
}