package com.lab13.pattern.iterator.exercise1;

public interface Iterator {
    boolean hasNext();
    Object next();
    void remove(int position);
}
