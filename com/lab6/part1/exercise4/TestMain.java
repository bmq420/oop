package com.lab6.part1.exercise4;

public class TestMain {
    public static void main(String[] args) {
        testShape();
        testCircle();
        testRectangle();
        testSquare();
    }

    //Test Shape class
    public static void testShape() {
        Shape shape = new Shape();
        System.out.println("Default shape: "+ shape.toString());
        shape.setColor("blue");
        System.out.println("Set shape's color to blue: " + shape.getColor());
        shape.setFilled(false);
        System.out.println("Set shape's filled to false: " + shape.isFilled());
        System.out.println("Shape: " + shape.toString());
    }

    //Test Circle class
    public static void testCircle() {
        Circle circle = new Circle();
        System.out.println("\nDefault circle: " + circle.toString());
        circle.setRadius(10);
        System.out.println("Set circle's radius to 10: " + circle.getRadius());
        circle.setColor("yellow");
        System.out.println("Set circle's color to yellow: " + circle.getColor());
        circle.setFilled(false);
        System.out.println("Set circle's filled to false: " + circle.isFilled());
        System.out.println("Circle: " + circle.toString());
        System.out.printf("Circle's area: %.2f\n", circle.getArea());
        System.out.printf("Circle's perimeter: %.2f\n", circle.getPerimeter());
    }

    //Test Rectangle class
    public static void testRectangle() {
        Rectangle rectangle = new Rectangle();
        System.out.println("\nDefault rectangle: " + rectangle.toString());
        rectangle.setWidth(5);
        System.out.println("Set rectangle's width to 5: " + rectangle.getWidth());
        rectangle.setLength(10);
        System.out.println("Set rectangle's length to 10: " + rectangle.getLength());
        rectangle.setColor("black");
        System.out.println("Set rectangle's color to black: " + rectangle.getColor());
        rectangle.setFilled(false);
        System.out.println("Set rectangle's filled to false: " + rectangle.isFilled());
        System.out.println("Rectangle: " + rectangle.toString());
        System.out.printf("Rectangle's area: %.2f\n", rectangle.getArea());
        System.out.printf("Rectangle's perimeter: %.2f\n", rectangle.getPerimeter());
    }

    //Test Square class
    public static void testSquare() {
        Square square = new Square();
        System.out.println("\nDefault square: " + square.toString());
        square.setSide(5);
        System.out.println("Set square's side to 5: " + square.getSide());
        square.setColor("pink");
        System.out.println("Set square's color to pink: " + square.getColor());
        square.setFilled(false);
        System.out.println("Set square's filled to false: " + square.isFilled());
        System.out.println("Square: " + square.toString());
        System.out.printf("Square's area: %.2f\n", square.getArea());
        System.out.printf("Square's perimeter: %.2f\n", square.getPerimeter());
    }
}
