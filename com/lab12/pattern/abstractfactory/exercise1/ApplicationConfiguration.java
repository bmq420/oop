package com.lab12.pattern.abstractfactory.exercise1;

public class ApplicationConfiguration {
    public static void main(String[] args) throws Exception {
        GUIFactory factory;
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            factory = new WinFactory();
        } else if (os.contains("mac")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error! Unknown operating system");
        }

        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}
