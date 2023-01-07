package com.lab6.part2.exercise1;

public class TestLine {
    public static void main(String[] args) {
        Line line1 = new Line(0, 0, 3, 4);
        System.out.println(line1);
        System.out.println("Line's length: " + line1.getLength());
        System.out.println("Line's gradient: " + line1.getGradient());

        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        Line line2 = new Line(point1, point2);
        System.out.println(line2);
        System.out.println("Line's length: " + line1.getLength());
        System.out.println("Line's gradient: " + line1.getGradient());
    }
}
