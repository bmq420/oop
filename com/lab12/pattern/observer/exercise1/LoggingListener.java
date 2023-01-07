package com.lab12.pattern.observer.exercise1;

import java.io.File;

public class LoggingListener implements EventListeners {
    private File log;

    public LoggingListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
