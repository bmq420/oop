package com.lab14.pattern.visitor.exercise3;

public interface Shape {
    void move(int x, int y);
    void draw();
    void accept(Visitor visitor);
}
