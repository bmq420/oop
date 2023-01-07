package com.lab13.pattern.decorator.exercise2;

public class NutsToppingDecorator extends ToppingDecorator {
    public NutsToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    public String getDescription() {
        return addTopping() + super.getDescription();
    }

    @Override
    public String addTopping() {
        return "nuts ";
    }
}
