package com.lab13.pattern.iterator.exercise1;

public class ProductIterator implements Iterator {
    private String[] productCatalog;
    private int length;
    int position = 0;

    public ProductIterator(String[] productCatalog, int length) {
        this.productCatalog = productCatalog;
        this.length = length;
    }

    @Override
    public boolean hasNext() {
        return position < length && position < productCatalog.length;
    }

    @Override
    public Object next() {
        return productCatalog[position++];
    }

    @Override
    public void remove(int position) {
        if (position >= length)
            return;

        for (int i = position; i < length; i++) {
            productCatalog[i] = productCatalog[i + 1];
        }
        length--;
    }
}
