package com.lab5.part2.exercise8;

//Exercise 8 main class
public class TestMain {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(0, 0, 5);
        System.out.println("center x is: " + circle1.getCenterX());
        System.out.println("center y is: " + circle1.getCenterY());
        System.out.println("radius is: " + circle1.getRadius());
        System.out.println("center is: " + circle1.getCenter());

        circle1.setCenterX(1);
        circle1.setCenterY(1);
        circle1.setRadius(10);
        System.out.println("center x is: " + circle1.getCenterX());
        System.out.println("center y is: " + circle1.getCenterY());
        System.out.println("radius is: " + circle1.getRadius());
        System.out.println("center is: " + circle1.getCenter());

        circle1.setCenterXY(2, 2);
        System.out.println("[" + circle1.getCenterXY()[0] + ", " + circle1.getCenterXY()[1] + "]");
        System.out.printf("getArea is: %.2f%n", circle1.getArea());
        System.out.printf("getCircumference is: %.2f%n", circle1.getCircumference());
        MyCircle circle2 = new MyCircle(3, 3, 3);
        System.out.printf("distance is: %.2f%n", circle1.distance(circle2));
    }
}
