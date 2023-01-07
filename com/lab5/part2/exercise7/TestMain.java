package com.lab5.part2.exercise7;

//Exercise 7 main class
public class TestMain {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(2, 2, 4, 4);
        System.out.println(line1);
        System.out.println("Begin x is: " + line1.getBeginX());
        System.out.println("Begin y is: " + line1.getBeginY());
        System.out.println("End x is: " + line1.getEndX());
        System.out.println("End y is: " + line1.getEndY());
        line1.setBeginX(0);
        line1.setBeginY(0);
        line1.setEndX(2);
        line1.setEndY(2);
        System.out.println(line1);
        line1.setBeginXY(5, 5);
        line1.setEndXY(0, 0);
        System.out.println("[" + line1.getBeginXY()[0] + ", " + line1.getBeginXY()[1] + "]");
        System.out.println("[" + line1.getEndXY()[0] + ", " + line1.getEndXY()[1] + "]");
        System.out.printf("getLength is: %.2f%n", line1.getLength());
        System.out.printf("getGradient is: %.2f%n", line1.getGradient());
    }
}
