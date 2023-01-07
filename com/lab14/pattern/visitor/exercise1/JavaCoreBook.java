package com.lab14.pattern.visitor.exercise1;

public class JavaCoreBook implements ProgramingBook {
    private String resource;

    public JavaCoreBook(String resource) {
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

    public String getFavouriteBook() {
        return "Favorite book for Java core";
    }
}
