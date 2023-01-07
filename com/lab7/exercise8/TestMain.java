package com.lab7.exercise8;

//Exercise 1.8. Interface Movable and its implementation subclasses MovablePoint and MovableCircle
public class TestMain {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint( 5,6, 10,15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        Movable m3 = new MovableRectangle(0, 0, 5, 5, 10, 10);
        System.out.println(m3);
        m3.moveDown();
        System.out.println(m3);
    }
}
