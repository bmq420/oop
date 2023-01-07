package com.lab2.exercise2;

import java.util.Scanner;

//Exercise 2.8. copyOf()
public class CopyOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array's length: ");
        int arrayLength = Integer.parseInt(scan.next());

        System.out.print("Enter the value of all elements (separated by space): ");
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = Integer.parseInt(scan.next());
        }

        int[] copyArray = copyOf(array);

        for (int i = 0; i < copyArray.length; i++) {
            System.out.print(copyArray[i] + " ");
        }
        System.out.println();

        System.out.println("Copy array with required length");
        System.out.print("Enter the array's length that you want to copy: ");
        int arrayLength2 = Integer.parseInt(scan.next());

        System.out.print("Enter the value of all elements in the array that you want to copy (separated by space): ");
        int[] array2 = new int[arrayLength2];
        for (int i = 0; i < arrayLength2; i++) {
            array2[i] = Integer.parseInt(scan.next());
        }

        System.out.print("Enter the number of copied array's required length: ");
        int newLength = Integer.parseInt(scan.next());
        scan.close();

        int[] copyArray2 = copyOf(array2, newLength);

        for (int i = 0; i < copyArray2.length; i++) {
            System.out.print(copyArray2[i] + " ");
        }
    }

    public static int[] copyOf(int[] array) {
        int[] copyArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }

        return copyArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] result = new int[newLength];
        for (int i = 0; i < result.length; i++) {
            if (i < array.length) {
                result[i] = array[i];
            } else {
                result[i] = 0;
            }
        }
        return result;
    }
}
