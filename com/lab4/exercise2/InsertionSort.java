package com.lab4.exercise2;

import java.util.Scanner;

//Exercise 2.5. Insertion Sort
public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = scanArray(scan);
        scan.close();

        insertionSort(array);
        printArray(array);
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

    public static void insertionSort(int[] array) {
        for (int fIdx = 1; fIdx < array.length; fIdx++) {
            int key = array[fIdx];
            int bIdx = fIdx - 1;
            while (bIdx >= 0 && array[bIdx] > key) {
                array[bIdx + 1] = array[bIdx];
                bIdx--;
            }
            array[bIdx + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        System.out.println("Selection sort result:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
