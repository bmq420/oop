package com.lab2.exercise2;

import java.util.Scanner;

//Exercise 2.1. getExponent()
public class Exponent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = Integer.parseInt(scan.next());
        System.out.print("Enter the getExponent: ");
        int exp = Integer.parseInt(scan.next());
        scan.close();

        System.out.println(base + " raises to the power of " + exp + " is: " + getExponent(base, exp));
    }

    public static int getExponent(int base, int exp) {
        int product = 1;

        for (int i = 0; i < exp; i++) {
            product *= base;
        }

        return product;
    }
}
