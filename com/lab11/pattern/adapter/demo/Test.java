package com.lab11.pattern.adapter.demo;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        MovableAdapter adapter = new MovableAdapter(car);

        System.out.println("Car's speed in miles per hour: " + car.getSpeed());
        System.out.println("Car's speed in km per hour: " + adapter.getSpeed());
    }
}
