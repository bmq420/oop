package com.lab7.exercise6;

//Exercise 1.6. Abstract Superclass Animal and its Implementation Subclasses
public class TestMain {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        cat.greets();

        Dog dog1 = new Dog("Spike");
        dog1.greets();
        Dog dog2 = new Dog("Jerry");
        dog1.greets(dog2);

        BigDog bigDog1 = new BigDog("Big Dawg");
        bigDog1.greets();
        bigDog1.greets(dog1);
        BigDog bigDog2 = new BigDog("Big Dog");
        bigDog1.greets(bigDog2);
    }
}
