package com.lab5.part1.exercise1;

//Exercise 1 main class
public class TestCircle {
    public static void main(String[] args) {
        //1
        Circle circle1 = new Circle();
        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " + circle1.getArea());
        Circle circle2 = new Circle(2.0);
        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " + circle2.getArea());

        //4
        Circle circle3 = new Circle();
        circle3.setRadius(5.5);
        System.out.println("radius is: " + circle3.getRadius());
        circle3.setColor("green");
        System.out.println("color is: " + circle3.getColor());
//        System.out.println(circle3.setRadius(4.4));

        //6
        Circle circle4 = new Circle(5.5);
        System.out.println(circle4.toString());
        Circle circle5 = new Circle(6.6);
        System.out.println(circle5.toString());
        System.out.println(circle5);
        System.out.println("Operator " + " invokes toString() to: " + circle5);
    }
}
