package com.lab13.pattern.decorator.exercise2;

public class HoneyToppingDecorator extends ToppingDecorator {
    public HoneyToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    public String getDescription() {
        return addTopping() + super.getDescription();
    }

    @Override
    public String addTopping() {
        return "honey ";
    }
}
