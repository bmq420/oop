package com.lab4.exercise1;

//Exercise 1.1. Factorial Recursive
public class FactorialRecursion {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Recursive version of the factorial of " + num + ": " + factorial(num));
        System.out.println("Iterative version of the factorial of " + num + ": " + iterativeFactorial(num));
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static int iterativeFactorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
