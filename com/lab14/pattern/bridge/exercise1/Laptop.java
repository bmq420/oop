package com.lab14.pattern.bridge.exercise1;

public class Laptop extends Computer {
    public Laptop(OperatingSystem os) {
        super(os);
    }

    public void startup() {
        os.startup();
        System.out.println(" Laptop");
    }

    @Override
    public void browseInternet(String url) {
        os.loadUrl(url);
    }

    @Override
    public boolean canMoveComputer() {
        return true;
    }
}
