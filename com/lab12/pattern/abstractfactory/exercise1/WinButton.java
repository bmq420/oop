package com.lab12.pattern.abstractfactory.exercise1;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Window's button");
    }
}
