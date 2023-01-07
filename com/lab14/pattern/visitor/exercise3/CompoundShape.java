package com.lab14.pattern.visitor.exercise3;

public class CompoundShape implements Shape {
    private int x;
    private int y;

    public CompoundShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Compound Shape move [" + x + ", " + y + "]");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompoundShape(this);
    }
}
