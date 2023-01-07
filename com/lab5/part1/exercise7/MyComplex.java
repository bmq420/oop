package com.lab5.part1.exercise7;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(real).append(" + ").append(imag).append("i");
        return builder.toString();
    }

    public boolean isReal() {
        if (Double.compare(this.imag, 0.0) == 0) {
            return true;
        }
        return false;
    }

    public boolean isImaginary() {
        if (Double.compare(this.real, 0.0) == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(double real, double imag) {
        if (Double.compare(this.real, real) == 0 && Double.compare(this.imag, imag) == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(MyComplex another) {
        if (Double.compare(this.real, another.getReal()) == 0 && Double.compare(this.imag, another.getImag()) == 0) {
            return true;
        }
        return false;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2));
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex result = new MyComplex();
        result.setReal(this.real + right.getReal());
        result.setImag(this.imag + right.getImag());
        return result;
    }
}
