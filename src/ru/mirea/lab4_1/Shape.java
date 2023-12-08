package ru.mirea.lab4_1;

// Родительский класс Shape
class Shape {
    public double area;
    public double perimeter;

    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }

    // Метод для получения типа фигуры
    public String getType() {
        return "Shape";
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "This is a " + getType();
    }
}

// Дочерний класс Circle, наследующий Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Переопределение метода getArea()
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Переопределение метода getPerimeter()
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Переопределение метода getType()
    @Override
    public String getType() {
        return "Circle";
    }
}

// Дочерний класс Rectangle, наследующий Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Переопределение метода getArea()
    @Override
    public double getArea() {
        return width * height;
    }

    // Переопределение метода getPerimeter()
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Переопределение метода getType()
    @Override
    public String getType() {
        return "Rectangle";
    }
}

// Дочерний класс Square, наследующий Rectangle
class Square extends Rectangle {
    public Square(double side) {
        super (side,side);
    }

    // Переопределение метода getType()
    @Override
    public String getType() {
        return "Square";
    }
}



