package com.homework3;

//Exercise 1.4. FactorialInt (Handling Overflow)
public class FactorialInt {
    public static void main(String[] args) {
        int factor = 1;
        System.out.println("-> Factorial integer:");
        while ((Integer.MAX_VALUE / findFactorialInt(factor - 1)) > factor) {
            System.out.println("The factorial of " + factor + " is " + findFactorialInt(factor));
            factor++;
        }
        System.out.println("The factorial of " + factor + " is out of range");

        factor = 1;
        System.out.println("-> Factorial long: ");
        while ((Long.MAX_VALUE / findFactorialLong(factor - 1)) > factor) {
            System.out.println("The factorial of " + factor + " is " + findFactorialLong(factor));
            factor++;
        }
        System.out.println("The factorial of " + factor + " is out of range");
    }

    public static int findFactorialInt(int factor) {
        int result = 1;
        for (int i = 1; i <= factor; i++) {
            result *= i;
        }
        return result;
    }

    public static long findFactorialLong(int factor) {
        long result = 1;
        for (int i = 1; i <= factor; i++) {
            result *= i;
        }
        return result;
    }
}
