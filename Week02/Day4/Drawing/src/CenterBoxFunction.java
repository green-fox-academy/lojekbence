import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a function that draws one square and takes 2 parameters:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int size = random.nextInt(WIDTH/2);
            drawCenteredSquare(size, graphics);
        }
    }

    public static void drawCenteredSquare(int size, Graphics graphics) {
        graphics.setColor(Color.ORANGE);
        int halfSize = size / 2;
        int halfWidth = WIDTH / 2;
        int halfHeight = HEIGHT / 2;
        int x1 = halfWidth - halfSize;
        int x2 = halfWidth + halfSize;
        int y1 = halfHeight - halfSize;
        int y2 = halfHeight + halfSize;
        int xCoordinates[] = {x1, x1, x2, x2};
        int yCoordinates[] = {y1, y2, y2, y1};
        graphics.drawPolygon(xCoordinates, yCoordinates, xCoordinates.length);
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