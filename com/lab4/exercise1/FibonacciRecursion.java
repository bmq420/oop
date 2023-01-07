package com.lab4.exercise1;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int num = 9;
        System.out.println("Recursive method to compute Fibonnacci number of " + num + ": " + fibonacci(num));
    }

    public static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
