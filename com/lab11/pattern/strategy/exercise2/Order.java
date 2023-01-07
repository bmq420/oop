package com.lab11.pattern.strategy.exercise2;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;
    private PayStrategy strategy;

    private static Order instance;

    private Order() {
        this.strategy = strategy;
    }

    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }

    public void processOrder(PayStrategy strategy) {
        this.strategy = strategy;
        this.strategy.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
