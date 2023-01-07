package com.lab14.pattern.visitor.exercise2;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPartDisplayVisitor visitor = new ComputerPartDisplayVisitor();
        Computer computer = new Computer();

        computer.accept(visitor);
        for (ComputerPart part : computer.getParts()) {
            part.accept(visitor);
        }
    }
}
