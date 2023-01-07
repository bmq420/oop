package com.lab14.pattern.visitor.exercise3;

public class Circle implements Shape {
    private int x;
    private int y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("Circle move [" + x + ", " + y + "]");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
