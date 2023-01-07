package com.homework1.exercise1;

import java.util.Scanner;

//Exercise 1.2. CheckerPattern
public class CheckerPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = Integer.parseInt(scan.next());
        drawCheckerPattern(size);
        scan.close();
    }

    public static void drawCheckerPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row % 2) == 0) {
                    System.out.print(" #");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
