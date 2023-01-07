package com.lab13.pattern.decorator.exercise1;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.draw();
    }
}
