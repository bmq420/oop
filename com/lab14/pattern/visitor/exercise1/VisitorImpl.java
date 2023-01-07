package com.lab14.pattern.visitor.exercise1;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(BusinessBook book) {
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println(book.getResource());
    }

    @Override
    public void visit(DesignPatternBook book) {
        System.out.println(book.getResource());
        System.out.println(book.getBestSeller());
    }

    @Override
    public void visit(JavaCoreBook book) {
        System.out.println(book.getResource());
        System.out.println(book.getFavouriteBook());
    }
}
