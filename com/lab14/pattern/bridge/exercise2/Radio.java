package com.lab14.pattern.bridge.exercise2;

public class Radio implements Device {
    private boolean enable;
    private int volume;
    private int channel;

    public Radio() {
        enable = false;
        volume = 0;
        channel = 0;
    }

    @Override
    public boolean isEnabled() {
        return enable;
    }

    @Override
    public void enable() {
        enable = true;
    }

    @Override
    public void disable() {
        enable = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
