package com.lab12.pattern.abstractfactory.exercise1;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("macOS's checkbox");
    }
}
