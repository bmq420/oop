package com.lab12.pattern.factorymethod.exercise2;

public class CallingClass {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();
        Fruit fruit1 = factory.produceFruit("Apple");
        fruit1.produceJuice();

        Fruit fruit2 = factory.produceFruit("Orange");
        fruit2.produceJuice();

        Fruit fruit3 = factory.produceFruit("Banana");
        fruit3.produceJuice();
    }
}
