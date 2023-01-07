package com.lab6.part2.exercise1;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(10,20);
        System.out.println(point);
        point.setXY(100, 10);
        System.out.println("Set point's x value to 100: " + point.getX());
        System.out.println("Set point's y value to 10: " + point.getY());
        System.out.println(point);
    }
}
