package com.homework1.exercise1;

import java.util.Scanner;

//Exercise 1.3. TimeTable
public class TimeTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = Integer.parseInt(scan.next());
        scan.close();
        drawTable(size);
    }

    public static void drawTable(int size) {
        for (int row = 0; row <= size + 1; row++) {
            for (int col = 0; col <= size; col++) {
                if (col == 0 && row == 0) {
                    System.out.printf("%4s |", "*");
                }
                if (row == 0 && col > 0) {
                    System.out.printf("%4d", col);
                }
                if (row == 1) {
                    System.out.printf("%4s", "--");
                }
                if (col == 0 && row > 1) {
                    System.out.printf("%4d |", row - 1);
                }
                if (row > 1 && col != 0) {
                    System.out.printf("%4d", (row - 1) * col);
                }
            }
            System.out.println();
        }
    }
}
