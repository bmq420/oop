package com.lab4.exercise2;

import java.util.Arrays;
import java.util.Scanner;

//Exercise 2.2. Recursive Binary Search
public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = scanArray(scan);
        int key = scanKey(scan);
        scan.close();

        Arrays.sort(array);
        printArray(array, key);
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

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length);
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            if (key == array[fromIdx]) {
                return true;
            } else {
                return false;
            }
        } else {
            int midIdx = (fromIdx + toIdx) / 2;
            if (key == array[midIdx]) {
                return true;
            } else if (key < array[midIdx]) {
                toIdx = midIdx;
            } else {
                fromIdx = midIdx + 1;
            }
            return binarySearch(array, key, fromIdx, toIdx);
        }
    }

    public static void printArray(int[] array, int key) {
        System.out.println("Search " + key + " in the entire array using binary search");
        if (binarySearch(array, key)) {
            System.out.println(key + " is in the array");
        } else {
            System.out.println(key + " isn't in the array");
        }
    }
}
