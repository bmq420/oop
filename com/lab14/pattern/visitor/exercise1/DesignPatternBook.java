package com.lab14.pattern.visitor.exercise1;

public class DesignPatternBook implements ProgramingBook {
    private String resource;

    public DesignPatternBook(String resource) {
        this.resource = resource;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getResource() {
        return resource;
    }

    public String getBestSeller() {
        return "Best selling design pattern book";
    }
}
