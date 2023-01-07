package com.lab5.part1.exercise8;

//Exercise 8 main class
public class TestMain {
    public static void main(String[] args) {
        MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
        System.out.println("Polynomial 1: " + polynomial1.toString());
        MyPolynomial polynomial2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println("Polynomial 2: " + polynomial2.toString());
        double[] coeffs = {1.2, 3.4, 5.6, 7.8};
        MyPolynomial polynomial3 = new MyPolynomial(coeffs);
        System.out.println("Polynomial 3: " + polynomial3.toString());

        System.out.println("Evaluate Polynomial 1: " + polynomial1.evaluate(5.0));
        System.out.println("Add Polynomial 2 and Polynomial 3: " + polynomial2.add(polynomial3));
        System.out.println("Multiply Polynomial 2 and Polynomial 3: " + polynomial2.multiply(polynomial3));
    }
}
