package com.lab5.part2.exercise4;

public class Customer {
    private int id;
    private String name;
    private int discount;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append(name).append("(").append(id).append(")(").append(discount).append("%)");
        return build.toString();
    }
}
