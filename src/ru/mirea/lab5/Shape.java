package ru.mirea.lab5;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape() {
        Random random = new Random();
        this.color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        this.x = random.nextInt(400);
        this.y = random.nextInt(400);
    }

    abstract void draw(Graphics g);
}

class Circle extends Shape {
    private int radius;

    public Circle() {
        super();
        Random random = new Random();
        this.radius = random.nextInt(50) + 10;  // Радиус от 10 до 59
    }

    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}

class Rectangle extends Shape {
    private int width, height;

    public Rectangle() {
        super();
        Random random = new Random();
        this.width = random.nextInt(100) + 20;  // Ширина от 20 до 119
        this.height = random.nextInt(80) + 20;  // Высота от 20 до 99
    }

    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

class RandomShapes extends JFrame {
    private Shape[] shapes;

    public RandomShapes() {
        setTitle("Random Shapes");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        shapes = new Shape[20];
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                shapes[i] = new Circle();
            } else {
                shapes[i] = new Rectangle();
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                RandomShapes shapes = new RandomShapes();
                shapes.setVisible(true);
            }
        });
    }
}
