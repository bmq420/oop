package com.lab12.pattern.factorymethod.exercise1;

public class Application {
    Dialog dialog;

    public void initialize() throws Exception {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            dialog = new WindowsDialog();
        } else if (os.contains("mac")) {
            dialog = new WebDialog();
        } else {
            throw new Exception("Error! Unknown operating system");
        }
    }

    public static void main(String[] args) throws Exception {
        Application app = new Application();
        app.initialize();
        app.dialog.render();
    }
}
