package com.lab12.pattern.observer.exercise2;

public abstract class Observer {
    public Subject subject;
    public String result;


    public Observer(Subject subject) {
        this.subject = subject;
    }

    public abstract void update();

    public String toString() {
        return result;
    }
}
