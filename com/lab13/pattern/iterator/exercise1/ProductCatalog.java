package com.lab13.pattern.iterator.exercise1;

public class ProductCatalog implements Iterable {
    private String[] productCatalog;
    private final int SIZE = 100;
    private int length;

    public ProductCatalog() {
        productCatalog = new String[SIZE];
        length = 0;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator(productCatalog, length);
    }

    public ProductCatalog addProduct(String product) {
        if (product == null || length > productCatalog.length)
            return this;

        productCatalog[length] = product;
        length++;
        return this;
    }
}
