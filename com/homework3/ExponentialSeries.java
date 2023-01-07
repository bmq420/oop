package com.homework3;

import java.util.Scanner;

//Exercise 1.3. Exponential Series
public class ExponentialSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter X value: ");
        double xValue = Double.parseDouble(scan.next());
        System.out.print("Enter number terms: ");
        int numTerms = Integer.parseInt(scan.next());
        scan.close();

        System.out.println("Result: " + specialSeries(xValue, numTerms));
    }

    public static double specialSeries(double xValue, int numTerms) {
        double result = 0;
        int pow = 1;
        for (int i = 0; i < numTerms; i++) {
            result += calElement(xValue, pow);
            pow += 2;
        }
        return result;
    }

    public static double calElement(double xValue, int pow) {
        double result = 1;
        for (int i = 1; i <= pow; i++) {
            if (i == pow) {
                result *= xValue / i;
                break;
            }
            if (i % 2 == 1) {
                result *= xValue * i;
            } else {
                result *= xValue / i;
            }
        }
        return result;
    }
}
