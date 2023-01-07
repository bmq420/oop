package com.lab12.pattern.abstractfactory.exercise2;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        FactoryProducer producer = new FactoryProducer();

        AbstractFactory shapeFactory = producer.getFactory("normal");
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();

        AbstractFactory roundedFactory = producer.getFactory("rounded");
        Shape roundedRectangle = roundedFactory.getShape("rectangle");
        roundedRectangle.draw();

        Shape roundedSquare = roundedFactory.getShape("square");
        roundedSquare.draw();

    }
}
