package com.lab12.pattern.abstractfactory.exercise1;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("macOS's button");
    }
}
