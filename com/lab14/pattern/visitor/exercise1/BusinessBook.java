package com.lab14.pattern.visitor.exercise1;

public class BusinessBook implements Book {
    private String publisher;

    public BusinessBook(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getPublisher() {
        return publisher;
    }

    public String getResource() {
        return "Business book";
    }
}
