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
import java.util.concurrent.TimeUnit;

public class Animate {

    // These fields drive the animation — they shrink the rectangle's
    // size and shift its top-left corner a little further each frame.
    // Being fields (not local variables) is what lets MyDrawP read
    // them every time paintComponent() runs, frame after frame.
    int x = 1;
    int y = 1;

    public static void main(String[] args) {
        Animate gui = new Animate();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        MyDrawP drawP = new MyDrawP();
        frame.getContentPane().add(drawP);
        frame.setSize(500, 270);
        frame.setVisible(true);

        // The animation loop. Each pass: bump x/y, ask Swing to redraw,
        // then pause briefly so the change is visible to the eye instead
        // of finishing in an instant blur.
        for (int i = 0; i < 124; i++, y++, x++) {
            // Worth flagging: x is incremented here AND again in the
            // for-loop's own increment clause (the "x++" up in the
            // parentheses), so x actually grows by 2 every iteration
            // while y only grows by 1. If that's intentional — to make
            // the rectangle shrink faster horizontally than vertically —
            // great, but if you expected symmetric shrinking, this
            // double increment is why it won't look that way.
            x++;

            // repaint() doesn't draw immediately — it tells Swing "this
            // component is now out of date," and Swing schedules
            // paintComponent() to run again on its own timeline. That's
            // why this works as animation: we change x/y, ask for a
            // redraw, wait, and repeat.
            drawP.repaint();

            try {
                // Pausing the thread is what makes this look like
                // animation rather than a single instant resize. Without
                // this sleep, all 124 frames would render faster than
                // your eye could perceive any change at all.
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (Exception ex) {
                // Swallowing the InterruptedException here is generally
                // not great practice (it hides a signal that something
                // wanted this thread to stop), but for a short teaching
                // exercise like this it's a reasonable shortcut.
            }
        }
    }

    // An inner class, just like ButtonListener back in TwoButtons — it
    // can reach Animate's x and y fields directly because it's bound to
    // a specific Animate instance, with no need to pass them in.
    class MyDrawP extends JPanel {
        public void paintComponent(Graphics g) {
            // Painting over the whole panel white first, then drawing
            // the blue rectangle on top, is what prevents "trails" —
            // without this, every previous frame's rectangle would stay
            // visible underneath the new one.
            g.setColor(Color.white);
            g.fillRect(0, 0, 500, 250);

            g.setColor(Color.blue);
            // As x and y grow, the rectangle's top-left corner moves
            // down-and-right, AND its width/height shrink (since they're
            // calculated as 500 - x*2 and 250 - y*2). The combined effect
            // is a rectangle that shrinks toward the center.
            g.fillRect(x, y, 500 - x * 2, 250 - y * 2);
        }
    }
}