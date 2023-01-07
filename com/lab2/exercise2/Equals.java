package com.lab2.exercise2;

import java.util.Scanner;

//Exercise 2.7. equals()
public class Equals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of array 1: ");
        int array1Length = Integer.parseInt(scan.next());

        System.out.print("Enter the value of all array 1 (separated by space): ");
        int[] array1 = new int[array1Length];
        for (int i = 0; i < array1Length; i++) {
            array1[i] = Integer.parseInt(scan.next());
        }

        System.out.print("Enter the number of array 2: ");
        int array2Length = Integer.parseInt(scan.next());

        System.out.print("Enter the value of all array 2 (separated by space): ");
        int[] array2 = new int[array2Length];
        for (int i = 0; i < array2Length; i++) {
            array2[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        if (equals(array1, array2)) {
            System.out.println("Array 1 equals to array 2");
        } else {
            System.out.println("Array 1 doesn't equals to array 2");
        }
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
