package com.lab11.pattern.strategy.demo;

public class Midfielder implements Player {
    @Override
    public void position(int id) {
        if (id == 0) {
            System.out.println("Defensive Midfielder");
        } else if (id == 1) {
            System.out.println("Central Midfielder");
        } else {
            System.out.println("Attacking Midfielder");
        }
    }
}
