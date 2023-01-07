package com.lab6.part1.exercise5;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[name = " + name + "]";
    }
}
