package com.lab11.pattern.strategy.exercise1;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();

        int action = 0;
        if (action == 1) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (action == 2) {
            context.setStrategy(new ConcreteStrategySubtract());
        } else {
            context.setStrategy(new ConcreteStrategyMultiply());
        }
        System.out.println(context.executeStrategy(5, 6));
    }
}
