package com.lab12.pattern.factorymethod.exercise1;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows Button");
    }

    @Override
    public void onClick() {
        System.out.println("Windows click event");
    }
}
