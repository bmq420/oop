package com.lab12.pattern.abstractfactory.exercise2;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equals("square"))
            return new Square();
        else if (type.equals("rectangle"))
            return new Rectangle();
        else
            return null;
    }
}
