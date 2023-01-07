package com.lab4.exercise2;

import java.util.Scanner;

//Exercise 2.4. Bubble Sort
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = scanArray(scan);
        scan.close();

        bubbleSort(array);
        printResult(array);
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

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static void printResult(int[] array) {
        System.out.println("Bubble sort result: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
