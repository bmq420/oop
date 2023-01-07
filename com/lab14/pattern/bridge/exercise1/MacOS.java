package com.lab14.pattern.bridge.exercise1;

public class MacOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.print("Mac OS");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Mac load url: " + url);
    }
}
