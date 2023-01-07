package com.lab12.pattern.observer.exercise2;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        super(subject);
        super.subject.attach(this);
    }

    @Override
    public void update() {
        this.result = convertDecToHex(super.subject.getState());
    }

    private String convertDecToHex(int decimal) {
        return Long.toHexString((long) decimal);
    }
}
