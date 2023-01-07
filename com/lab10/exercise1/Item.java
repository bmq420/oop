package com.lab10.exercise1;

public abstract class Item {
    String title;
    int year;

    public Item(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Item[" +
                "title = '" + title + '\'' +
                ", year = " + year +
                ']';
    }
}
