package com.lab1.exercise3;

//Exercise 3.4. Fibonacci
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("1. Fibonacci");
        findFibonacci();

        System.out.println("2. Tribonacci");
        findTribonacci();
    }

    public static void findFibonacci() {
        int number = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        double sum = fnMinus1 + fnMinus2;
        double average;

        System.out.println("The first " + nMax + " Fibonacci numbers are: ");

        System.out.print(fnMinus1 + " ");
        System.out.print(fnMinus2);
        while (number <= nMax) {
            fn = fnMinus1 + fnMinus2;
            sum += fn;
            System.out.print(" " + fn);
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            number++;
        }
        System.out.println("");

        average = sum / 20;
        System.out.println("-> Average: " + average);

    }

    //1
    public static void findTribonacci() {
        int fn;
        int fnMinus1 = 2;
        int fnMinus2 = 1;
        int fnMinus3 = 1;
        int nMax = 20;
        double sum = 1;

        System.out.println("The first " + nMax + " Tribonacci numbers are: ");

        System.out.print(fnMinus3 + " " + fnMinus2 + " " + fnMinus1);
        for (int i = 3; i < nMax; i++) {
            fn = fnMinus1 + fnMinus2 + fnMinus3;
            sum += fn;
            System.out.print(" " + fn);
            fnMinus3 = fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
        System.out.println("");

        double average = sum / 20;
        System.out.println("-> Average: " + average);
    }
}
