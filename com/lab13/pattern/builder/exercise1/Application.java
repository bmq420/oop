package com.lab13.pattern.builder.exercise1;

public class Application {
    public void makeCar() {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getProduct();
        System.out.println(car);

        Director director2 = new Director();
        CarManualBuilder builder2 = new CarManualBuilder();
        director2.constructSUVCar(builder2);
        Manual manual = builder2.getProduct();
        System.out.println(manual);
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.makeCar();
    }
}
