import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        int x = WIDTH/4;
        int y = HEIGHT/4;
        int x2 = WIDTH/4*3;
        int y2 = HEIGHT/4*3;
        graphics.setColor(Color.green);
        graphics.drawLine(x, y, x, y2); // vertical left
        graphics.setColor(Color.red);
        graphics.drawLine(x, y, x2, y); // horizontal "left"
        graphics.setColor(Color.CYAN);
        graphics.drawLine(x2, y2, x2, y); // vertical right
        graphics.setColor(Color.BLACK);
        graphics.drawLine(x, y2, x2, y2); // horizontal "right"
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}