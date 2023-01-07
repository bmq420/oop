package com.lab7.exercise4;

//Exercise 1.4. Movable Interface and its Implementation Classes MovablePoint and MovableCircle
public class TestMain {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0, 0, 5, 5, 1);
        System.out.println("Circle: " + circle);
        circle.moveUp();
        System.out.println("Move up: " + circle);
        circle.moveDown();
        System.out.println("Move down: " + circle);
        circle.moveLeft();
        System.out.println("Move left: " + circle);
        circle.moveRight();
        System.out.println("Move right: " + circle);
    }
}
