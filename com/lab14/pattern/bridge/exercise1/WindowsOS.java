package com.lab14.pattern.bridge.exercise1;

public class WindowsOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.print("Windows OS");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Windows load url: " + url);
    }
}
