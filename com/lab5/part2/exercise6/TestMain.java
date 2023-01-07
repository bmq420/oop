package com.lab5.part2.exercise6;

//Exercise 6 main class
public class TestMain {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        System.out.println("Point 1: " + point1);

        point1.setX(8);
        point1.setY(6);
        System.out.println("x is: " + point1.getX());
        System.out.println("y is: " + point1.getY());

        point1.setXY(3, 0);
        System.out.println(point1.getXY()[0]);
        System.out.println(point1.getXY()[1]);
        System.out.println("Point 1: " + point1);

        MyPoint point2 = new MyPoint(0, 4);
        System.out.println("Point 2: " + point2);
        System.out.println("Point 1 and point 2 distance: " + point1.distance(point2));
        System.out.println("Point 2 and point 1 distance: " + point2.distance(point1));
        System.out.println("Point 1 and (5, 6) distance: " + point1.distance(5, 6));
        System.out.println("Point 1 and (0, 0) distance: " + point1.distance());

        System.out.println("Allocate 10 points in an array to MyPoint: ");
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i, i);
        }
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
        }
    }
}
