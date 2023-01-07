package com.lab4.exercise1;

//Exercise 1.4. GCD(Recursive)
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int firstNum = 10;
        int secondNum = 15;
        System.out.println("Greatest common divisor using recursion between " + firstNum + " and " + secondNum + " is: " + gcd(firstNum, secondNum));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
