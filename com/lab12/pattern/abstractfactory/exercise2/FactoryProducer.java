package com.lab12.pattern.abstractfactory.exercise2;

public class FactoryProducer {
    public AbstractFactory getFactory(String factoryType) {
        if (factoryType.equals("rounded"))
            return new RoundedShapeFactory();
        else if (factoryType.equals("normal"))
            return new ShapeFactory();
        else
            return null;
    }
}
