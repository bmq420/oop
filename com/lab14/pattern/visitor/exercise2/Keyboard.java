package com.lab14.pattern.visitor.exercise2;

import com.lab14.pattern.visitor.exercise1.Visitor;

public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
