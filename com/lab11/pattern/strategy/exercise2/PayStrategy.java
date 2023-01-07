package com.lab11.pattern.strategy.exercise2;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
