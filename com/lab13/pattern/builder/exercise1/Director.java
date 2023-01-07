package com.lab13.pattern.builder.exercise1;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.reset()
                .setSeats(2)
                .setEngine(new SportEngine())
                .setTripComputer(true)
                .setGPS(true);
    }

    public void constructSUVCar(Builder builder) {
        builder.reset()
                .setSeats(3)
                .setEngine(new SUVEngine())
                .setTripComputer(true)
                .setGPS(true);
    }
}
