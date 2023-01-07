package com.lab4.exercise3;

import java.util.Scanner;

//Exercise 3.3. Prime Factors
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int upperBound = getUpperBound(scan);
        scan.close();

        printResult(upperBound);
    }

    public static int getUpperBound(Scanner scan) {
        System.out.print("Enter the upper bound: ");
        int upperBound = Integer.parseInt(scan.next());
        return upperBound;
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0 && isPrime(i)) {
                product *= i;
            }
        }
        return (product == aPosInt);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printResult(int upperBound) {
        int countResult = 0;
        System.out.println("These numbers are equal to the product of prime factors: ");
        for (int i = 1; i <= upperBound; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                countResult++;
            }
        }
        double countPer = (double) countResult / upperBound * 100.0;
        System.out.printf("\n[%d numbers found (%.2f%%)]", countResult, countPer);
    }
}
