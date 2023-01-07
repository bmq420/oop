package com.lab10.exercise1;

public class Dvd extends Item {
    int duration;

    public Dvd(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Dvd[" +
                "duration = " + duration +
                ", title = '" + title + '\'' +
                ", year = " + year +
                ']';
    }
}
