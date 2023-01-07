package com.lab14.pattern.visitor.exercise2;

import java.util.Arrays;

public class Computer implements ComputerPart {
    private ComputerPart parts[];

    public Computer() {
        parts = new ComputerPart[]{
                new Keyboard(),
                new Mouse(),
                new Monitor()};
    }

    public ComputerPart[] getParts() {
        return parts;
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
