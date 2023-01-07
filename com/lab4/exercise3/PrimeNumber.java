package com.lab4.exercise3;

import java.util.Scanner;

//Exercise 3.2. Prime Number
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int upperBound = getUpperBound(scan);
        scan.close();

        printPrime(upperBound);
    }

    public static int getUpperBound(Scanner scan) {
        System.out.print("Enter the upper bound: ");
        int upperBound = Integer.parseInt(scan.next());
        return upperBound;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int upperBound) {
        int primeCount = 0;
        for (int i = 1; i < upperBound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeCount++;
            }
        }
        double primePer = (double) primeCount / upperBound * 100.0;
        System.out.printf("[%d primes found (%.2f%%)]", primeCount, primePer);
    }
}
