package com.lab14.pattern.visitor.exercise2;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
