package com.lab4.exercise2;

import java.util.Scanner;

//Exercise 2.3. Selection Sort
public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = scanArray(scan);
        scan.close();

        selectionSort(array);
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

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(int[] array) {
        System.out.println("Selection sort result:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
