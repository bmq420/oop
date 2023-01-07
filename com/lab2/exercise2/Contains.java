package com.lab2.exercise2;

import java.util.Scanner;

//Exercise 2.5. contains()
public class Contains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int arrayLength = Integer.parseInt(scan.next());

        System.out.print("Enter the value of all elements (separated by space): ");
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = Integer.parseInt(scan.next());
        }

        System.out.print("Enter the key: ");
        int key = Integer.parseInt(scan.next());
        scan.close();

        if (contains(array, key)) {
            System.out.println("The array contains the key");
        } else {
            System.out.println("The array doesn't contain the key");
        }
    }

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }
}
