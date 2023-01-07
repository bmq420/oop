package com.lab5.part1.exercise8;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        for (int i = this.getDegree(); i >= 0; i--) {
            build.append(coeffs[i]).append(" x^").append(i).append(" + ");
        }
        build.setLength(build.length() - 6);
        return build.toString();
    }

    public double evaluate(double x) {
        double polyValue = 0;
        for (int i = this.getDegree(); i > 0; i--) {
            polyValue = polyValue * x + this.coeffs[i];
        }
        return polyValue;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree() + 1, right.getDegree() + 1);
        double[] polyData = new double[maxDegree];

        for (int i = 0; i <= this.getDegree(); i++) {
            polyData[i] += this.coeffs[i];
        }

        for (int i = 0; i <= right.getDegree(); i++) {
            polyData[i] += right.coeffs[i];
        }

        MyPolynomial result = new MyPolynomial(polyData);
        return result;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int multiplyDegree = this.getDegree() + right.getDegree() + 1;
        double[] multiplyPolyData = new double[multiplyDegree];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                multiplyPolyData[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }

        MyPolynomial result = new MyPolynomial(multiplyPolyData);
        return result;
    }
}
