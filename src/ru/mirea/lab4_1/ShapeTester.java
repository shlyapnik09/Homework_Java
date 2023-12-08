package ru.mirea.lab4_1;

public class ShapeTester {
    public static void main(String[] args) {
        // Создаем объекты различных фигур
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(3, 4);
        Shape square = new Square(5);

        // Выводим информацию о фигурах
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
