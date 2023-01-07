package com.lab11.pattern.strategy.exercise1;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double a, double b) {
        return strategy.execute(a, b);
    }
}
