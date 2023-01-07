package com.lab5.part2.exercise9;

//Exercise 9 main class
public class TestMain {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(0, 0, 1, 1, 2, 2);
        System.out.println(triangle1);
        System.out.printf("perimeter is: %.2f%n", triangle1.getPerimeter());
        System.out.println("type: " + triangle1.getType());

        MyPoint point1 = new MyPoint(1, -1);
        MyPoint point2 = new MyPoint(1, 1);
        MyPoint point3 = new MyPoint(0, 0);
        MyTriangle triangle2 = new MyTriangle(point1, point2, point3);
        System.out.println(triangle2);
        System.out.printf("perimeter is: %.2f%n", triangle2.getPerimeter());
        System.out.println("type: " + triangle2.getType());
    }
}
