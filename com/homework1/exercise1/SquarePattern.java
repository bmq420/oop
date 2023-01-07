package com.homework1.exercise1;

import java.util.Scanner;

//Exercise 1.1. SquarePattern
public class SquarePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = Integer.parseInt(scan.next());
        scan.close();

        System.out.println("Nested for loop: ");
        usingNestedForLoop(size);

        System.out.println("Nested while loop: ");
        usingNestedWhileLoop(size);

    }

    public static void usingNestedForLoop(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    //1
    public static void usingNestedWhileLoop(int size) {
        int row = 1;
        int col = 1;

        while (row <= size) {
            while (col <= size) {
                System.out.print("# ");
                col++;
            }
            col = 1;
            row++;
            System.out.println();
        }
    }
}
