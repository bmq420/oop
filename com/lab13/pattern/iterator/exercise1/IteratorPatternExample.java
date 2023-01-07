package com.lab13.pattern.iterator.exercise1;

public class IteratorPatternExample {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct("Apple")
                .addProduct("Orange")
                .addProduct("Banana")
                .addProduct("Melon");

        Iterator iterator = catalog.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = catalog.getIterator();
        System.out.println("Remove apple");
        iterator.remove(1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
