/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_14;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import javax.sound.midi.*;
import java.util.Random;

class MyDrawPanel extends JPanel implements ControllerEventListener {
    private boolean msg = false;
    private Random random = new Random();

    public void controlChange(ShortMessage event) {
        msg = true;
        repaint();
    }

    public void paintComponent(Graphics g) {
        if (msg) {
            int r = random.nextInt(250);
            int gr = random.nextInt(250);
            int b = random.nextInt(250);
            g.setColor(new Color(r, gr, b));
            int height = random.nextInt(120) + 10;
            int width = random.nextInt(120) + 10;
            int xPos = random.nextInt(40) + 10;
            int yPos = random.nextInt(40) + 10;
            g.fillRect(xPos, yPos, width, height);
            msg = false;
        }
    }
}