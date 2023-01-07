package com.lab10.exercise2.part1;

public class MyArrayList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i  = 0; i < size; i++) {
            result.append(elements[i] + " ");
        }
        return result.toString();
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    @Override
    public void add(Object o, int index) {
        if (index >= elements.length - 1) {
            enlarge();
        }
        if (size < index) {
            size = index;
        }
        elements[index] = o;
        size++;
    }

    @Override
    public void remove(int index) {
        for (int i = 0; i < size - 1; i++) {
            if (index <= i) {
                elements[i] = elements[i + 1];
            }
        }
        if (index == size - 1) {
            elements[index] = null;
        }
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }
}
