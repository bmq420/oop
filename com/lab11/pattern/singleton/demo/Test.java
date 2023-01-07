package com.lab11.pattern.singleton.demo;

public class Test {
    public static void main(String[] args) {
        Singleton object = Singleton.getInstance();

        object.print();
    }
}
