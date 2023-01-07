package com.lab7.exercise5;

//Interface Resizable and GeometricObject
public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Circle: " + circle);
        System.out.println("Circle's perimeter: " + circle.getPerimeter());
        System.out.println("Circle's area: " + circle.getArea());

        ResizableCircle resizableCircle = new ResizableCircle(10);
        System.out.println("Resizable circle: " + resizableCircle);
        resizableCircle.resize(30);
        System.out.println("After resizing: " + resizableCircle);
        System.out.println("Circle's perimeter after resizing: " + resizableCircle.getPerimeter());
        System.out.println("Circle's area after resizing: " + resizableCircle.getArea());
    }
}
