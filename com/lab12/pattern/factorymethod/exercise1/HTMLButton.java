package com.lab12.pattern.factorymethod.exercise1;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("HTML representation of a button");
    }

    @Override
    public void onClick() {
        System.out.println("Web browser click event");
    }
}
