package com.lab11.pattern.strategy.demo;

public class Attacker implements Player {
    @Override
    public void position(int id) {
        if (id == 0) {
            System.out.println("Striker");
        } else if (id == 1) {
            System.out.println("Winger");
        } else {
            System.out.println("Second Striker");
        }
    }
}
