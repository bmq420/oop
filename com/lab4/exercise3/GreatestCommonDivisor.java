package com.lab4.exercise3;

//Exercise 3.4. Greatest Common Divisor (GCD)
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Euclid algorithm result: ");
        System.out.println("Greatest common divisor between 15 and 5 is: " + gcd(15, 5));
        System.out.println("Greatest common divisor between 99 and 88 is: " + gcd(99, 88));
        System.out.println("Greatest common divisor between 3456 and 1233 is: " + gcd(3456, 1233));
    }

    public static int gcd(int a, int b) {
        if (a < b) {
            int temp = b;
            b = a;
            a = temp;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
