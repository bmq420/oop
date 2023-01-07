package com.lab7.exercise3;

//Exercise 1.3. Movable Interface and its Implementation MovablePoint Class
public class TestMain {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 5, 5);
        System.out.println("Point: " + point);
        point.moveUp();
        System.out.println("Move up: " + point);
        point.moveDown();
        System.out.println("Move down: " + point);
        point.moveLeft();
        System.out.println("Move left: " + point);
        point.moveRight();
        System.out.println("Move right: " + point);
    }
}
