package com.lab1.exercise3;

// Exercise 3.3. ComputePI
public class ComputePI {
    public static void main(String[] args) {
        int MAX_DENOMINATOR = 1000;
        System.out.println("Max denominator = 1000");
        double PI1 = computePI(MAX_DENOMINATOR);
        System.out.println("1. Result: " + PI1);
        compareToBuildInPI(PI1);

        MAX_DENOMINATOR = 10000;
        System.out.println("Max denominator = 10000");
        double PI2 = computePI(MAX_DENOMINATOR);
        System.out.println("1. Result: " + PI2);
        compareToBuildInPI(PI2);
    }

    //1
    public static double computePI(int MAX_DENOMINATOR) {
        double sum = 0.0;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += (double) 1 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= (double) 1/ denominator;
            } else {
                return -1;
            }
        }
        double PI = sum * 4;
        return PI;
    }

    //2
    public static void compareToBuildInPI(double PI) {
        System.out.println("2. Percentage: " + (PI / Math.PI) * 100 + " %");
    }
}
