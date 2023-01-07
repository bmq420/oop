package com.lab12.pattern.factorymethod.exercise2;

public class FruitFactory {
    public Fruit produceFruit(String type) {
        if (type.equals("Apple")) {
            return new Apple();
        } else if (type.equals("Banana")) {
            return new Banana();
        } else {
            return new Orange();
        }
    }
}
