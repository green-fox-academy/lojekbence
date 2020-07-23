import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 0; i < 4; i++) {
            randomRectangles(graphics);
        }
    }

    public static void randomRectangles(Graphics graphics) {
        graphics.setColor(getRandomColor());
        Random random = new Random();
        int x1 = random.nextInt(WIDTH);
        int y1 = random.nextInt(HEIGHT);
        int x2 = random.nextInt(WIDTH);
        int y2 = random.nextInt(HEIGHT);
        int[] xCoordinates = {x1, x1 , x2, x2};
        int[] yCoordinates = {y1, y2, y2, y1};
        graphics.drawPolygon(xCoordinates, yCoordinates, xCoordinates.length);
    }

    public static Color getRandomColor() {
        Random random = new Random();
        int limit = 256;
        return new Color(random.nextInt(limit), random.nextInt(limit), random.nextInt(limit));
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