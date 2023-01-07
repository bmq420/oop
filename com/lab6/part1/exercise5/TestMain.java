package com.lab6.part1.exercise5;

public class TestMain {
    public static void main(String[] args) {
        testAnimal();
        testMammal();
        testCat();
        testDog();
    }

    //Test Animal class
    public static void testAnimal() {
        Animal animal = new Animal("animal");
        System.out.println("\n" + animal.toString());
    }

    //Test Mammal class
    public static void testMammal() {
        Mammal mammal = new Mammal("human");
        System.out.println("\n" + mammal.toString());
    }

    //Test Cat class
    public static void testCat() {
        Cat cat = new Cat("cat");
        System.out.println("\n" + cat.toString());
        cat.greets();
    }

    //Test Dog class
    public static void testDog() {
        Dog dog1 = new Dog("dog 1");
        System.out.println("\n" + dog1.toString());
        Dog dog2 = new Dog("dog 2");
        System.out.println(dog2.toString());
        dog1.greets();
        dog1.greets(dog2);
    }
}
