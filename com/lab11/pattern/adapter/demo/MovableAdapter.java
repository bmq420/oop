package com.lab11.pattern.adapter.demo;

public class MovableAdapter implements Movable {
    private Car car;

    public MovableAdapter(Car car) {
        this.car = car;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKmPH(car.getSpeed());
    }

    private double convertMPHtoKmPH(double mph) {
        return mph * 1.609;
    }
}
