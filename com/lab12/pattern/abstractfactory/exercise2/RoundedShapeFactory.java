package com.lab12.pattern.abstractfactory.exercise2;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equals("square"))
            return new RoundedSquare();
        else if (type.equals("rectangle"))
            return new RoundedRectangle();
        else
            return null;
    }
}