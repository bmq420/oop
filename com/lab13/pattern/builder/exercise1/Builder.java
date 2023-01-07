package com.lab13.pattern.builder.exercise1;

public interface Builder {
    Builder reset();
    Builder setSeats(int seats);
    Builder setEngine(Engine engine);
    Builder setTripComputer(boolean tripComputer);
    Builder setGPS(boolean gps);
}
