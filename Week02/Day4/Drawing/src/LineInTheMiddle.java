import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineInTheMiddle {
    public static void mainDraw(Graphics graphics){
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.
        int y = HEIGHT/2;
        graphics.setColor(Color.red);
        graphics.drawLine(0, y, WIDTH, y);
//        for (int i = 0; i < 69; i++) {
//            graphics.drawLine(x + i, y + i, x2 - i, y2 + i);
//        }
        int x = WIDTH/2;

        graphics.setColor(Color.green);
        graphics.drawLine(x,0, x, HEIGHT);
    }

    // Don't touch the code below
    static int WIDTH = 1280;
    static int HEIGHT = 720;

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