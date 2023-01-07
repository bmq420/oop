package com.lab11.pattern.strategy.demo;

public class Goalkeeper implements Player {
    @Override
    public void position(int id) {
        System.out.println("Goalkeeper");
    }
}
