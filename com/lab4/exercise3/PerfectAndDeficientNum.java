package com.lab4.exercise3;

import java.util.Scanner;

//Exercise 3.1. Perfect and Deficient Numbers
public class PerfectAndDeficientNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int upperBound = getUpperBound(scan);
        scan.close();

        printPerfect(upperBound);
        printNeitherDeficientNorPerfect(upperBound);
    }

    public static int getUpperBound(Scanner scan) {
        System.out.print("Enter the upper bound: ");
        int upperBound = Integer.parseInt(scan.next());
        return upperBound;
    }

    public static boolean isPerfect(int aPosInt) {
        int divSum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                divSum += i;
            }
        }
        return (divSum == aPosInt);
    }

    public static boolean isDeficient(int aPosInt) {
        int divSum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                divSum += i;
            }
        }
        return (divSum < aPosInt);
    }

    public static void printPerfect(int upperBound) {
        int perfectNumCount = 0;
        System.out.println("These numbers are perfect: ");
        for (int i = 1; i <= upperBound; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                perfectNumCount++;
            }
        }
        double perfectNumCountPer =  (double) perfectNumCount / upperBound * 100.0;
        System.out.printf("\n[%d perfect numbers found (%.2f%%)]", perfectNumCount, perfectNumCountPer);
    }

    public static void printNeitherDeficientNorPerfect(int upperBound) {
        int deficientNorPerfectCount = 0;
        System.out.println("\n\nThese numbers are neither deficient nor perfect: ");
        for (int i = 0; i <= upperBound; i++) {
            if (!isPerfect(i) && !isDeficient(i)) {
                System.out.print(i + " ");
                deficientNorPerfectCount++;
            }
        }
        double deficientNorPerfectPer = (double) deficientNorPerfectCount / upperBound * 100.0;
        System.out.printf("\n[%d numbers found (%.2f%%)]", deficientNorPerfectCount, deficientNorPerfectPer);
    }
}
