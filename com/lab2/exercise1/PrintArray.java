package com.lab2.exercise1;

import java.util.Scanner;

//Exercise 1.1. PrintArray
public class PrintArray {
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

        printArray(items);
    }

    public static void printArray(int[] items) {
        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                System.out.print("The values are: [" + items[i]);
            } else if (i == items.length - 1) {
                System.out.print(", " + items[i] + "]");
            } else {
                System.out.print(", " + items[i]);
            }
        }
    }
}
