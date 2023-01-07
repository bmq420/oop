package com.lab7.exercise2;

//Exercise 1.2. GeometricObject Interface and its Implementation Classes Circle and Rectangle
public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(20);
        System.out.println(circle);
        System.out.println("Circle's area: " + circle.getArea());
        System.out.println("Circle's perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle);
        System.out.println("Rectangle's area: " + rectangle.getArea());
        System.out.println("Rectangle's perimeter: " + rectangle.getPerimeter());
    }
}
