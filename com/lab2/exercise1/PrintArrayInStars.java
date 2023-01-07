package com.lab2.exercise1;

import java.util.Scanner;

//Exercise 1.2. PrintArrayInStars
public class PrintArrayInStars {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = Integer.parseInt(scan.next());
        items = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items (separated by space): ");
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                items[i] = Integer.parseInt(scan.next());
            }
        }
        scan.close();

        printStarArray(items);
    }

    public static void printStarArray(int[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.print(i + ": ");
            for (int starNo = 1; starNo <= items[i]; starNo++) {
                System.out.print("*");
            }
            System.out.println("(" + items[i] +")");
        }
    }
}
