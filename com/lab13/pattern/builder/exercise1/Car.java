package com.lab13.pattern.builder.exercise1;

public class Car {
    private int seats;
    private Engine engine;
    private boolean tripComputer;
    private boolean gps;

    public Car() {
    }

    public Car(int seats, Engine engine, boolean tripComputer, boolean gps) {
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public boolean getGPS() {
        return gps;
    }

    public void setGPS(boolean GPS) {
        this.gps = GPS;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine=" + engine +
                ", tripComputer=" + tripComputer +
                ", gps=" + gps +
                '}';
    }
}
