package com.lab11.pattern.strategy.demo;

public class Defender implements Player {
    @Override
    public void position(int id) {
        if (id == 0) {
            System.out.println("Center-back");
        } else if (id == 1) {
            System.out.println("Full-back");
        } else {
            System.out.println("Wing-back");
        }
    }
}
