package com.lab13.pattern.builder.exercise1;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public Builder reset() {
        this.car = new Car();
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        this.car.setSeats(seats);
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.car.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(boolean tripComputer) {
        this.car.setTripComputer(tripComputer);
        return this;
    }

    @Override
    public Builder setGPS(boolean gps) {
        this.car.setGPS(gps);
        return this;
    }

    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }
}
