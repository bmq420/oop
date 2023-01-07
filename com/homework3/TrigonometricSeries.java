package com.homework3;

import java.util.Scanner;

//Exercise 1.2. Trigonometric Series
public class TrigonometricSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your x value: ");
        double xValue = Double.parseDouble(scan.next());
        System.out.print("Enter your number terms: ");
        int numTerms = Integer.parseInt(scan.next());
        scan.close();

        System.out.println("Method result: " + sin(xValue, numTerms));
        System.out.println("Math.sin() result: " + Math.sin(xValue));

        System.out.println("Method result: " + cos(xValue, numTerms));
        System.out.println("Math.cos() result: " + Math.cos(xValue));
    }

    public static double sin(double xValue, int numTerms) {
        double sinResult = 0;
        int position = 1;
        for (int i = 0; i < numTerms; i++) {
            if (position % 4 == 1) {
                sinResult += calElement(xValue, position);
            } else {
                sinResult -= calElement(xValue, position);
            }
            position += 2;
        }
       return sinResult;
    }

    public static double cos(double xValue, int numTerms) {
        double cosResult = 0;
        int position = 0;
        for (int i = 0; i < numTerms; i++) {
            if (position % 4 == 0) {
                cosResult += calElement(xValue, position);
            } else {
                cosResult -= calElement(xValue, position);
            }
            position += 2;
        }
        return cosResult;
    }

    public static double calElement(double xValue, int position) {
        double result = 1;
        if (position == 0) {
            return result;
        }
        for (int i = position; i > 0; i--) {
            result *= xValue / i;
        }
        return result;
    }
}
