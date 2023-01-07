package com.lab12.pattern.observer.exercise1;

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LoggingListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailAlertsListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
