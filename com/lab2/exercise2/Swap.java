package com.lab2.exercise2;

import java.util.Scanner;

//Exercise 2.9. swap()
public class Swap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array 1's length: ");
        int array1Length = Integer.parseInt(scan.next());

        int[] array1 = new int[array1Length];
        System.out.print("Enter array 1's elements: ");
        for (int i = 0; i < array1Length; i++) {
            array1[i] = Integer.parseInt(scan.next());
        }

        System.out.print("Enter array 2's length: ");
        int array2Length = Integer.parseInt(scan.next());

        int[] array2 = new int[array2Length];
        System.out.print("Enter array 2's elements: ");
        for (int i = 0; i < array2Length; i++) {
            array2[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        System.out.println(swap(array1, array2));

        System.out.print("Array 1 after the swap: ");
        for (int i = 0; i < array1Length; i++) {
            System.out.print(array1[i] + "  ");
        }

        System.out.println();
        System.out.println("Array 2 after the swap: ");
        for (int i = 0; i < array2Length; i++) {
            System.out.print(array2[i] + "  ");
        }

    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;

        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        return true;
    }
}
