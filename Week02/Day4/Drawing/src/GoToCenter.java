import javax.swing.*;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Type how many lines should I print: ");
        int round = scanner.nextInt();
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.
        for (int i = 0; i < round; i++) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            drawLine(x, y, graphics);
        }
    }

    public static void drawLine(int x, int y, Graphics graphics) {
        int x2 = WIDTH/2;
        int y2 = HEIGHT/2;
        graphics.setColor(getRandomColor());
        graphics.drawLine(x, y, x2, y2);
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