package com.lab4.exercise2;

import java.util.Scanner;

//Exercise 2.1. Linear Search
public class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = scanArray(scan);
        int key = scanKey(scan);
        scan.close();

        printResult(array, key);
    }

    public static int[] scanArray(Scanner scan) {
        System.out.print("Enter array length: ");
        int arrayLength = Integer.parseInt(scan.next());
        int[] array = new int[arrayLength];
        System.out.print("Enter array in 1 line (separated by space): ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scan.next());
        }
        return array;
    }

    public static int scanKey(Scanner scan) {
        System.out.print("Enter key: ");
        int key = Integer.parseInt(scan.next());
        return key;
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void printResult(int[] array, int key) {
        if (linearSearch(array, key)) {
            System.out.println(key + " is at index number: " + linearSearchIndex(array, key));
        } else {
            System.out.println(key + " doesn't appear in the array.");
        }
    }
}
