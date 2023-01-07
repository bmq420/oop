package com.lab12.pattern.observer.exercise1;

import java.io.File;

public class EmailAlertsListener implements EventListeners {
    private String email;

    public EmailAlertsListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
