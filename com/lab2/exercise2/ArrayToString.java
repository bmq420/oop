package com.lab2.exercise2;

import java.util.Scanner;

//Exercise 2.4. arrayToString()
public class ArrayToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int arrayLength = Integer.parseInt(scan.next());
        int[] array = new int[arrayLength];

        if (arrayLength == 0) {
            System.out.println("The values: []");
        } else {
            System.out.print("Enter the value of all elements (separated by space): ");
            if (array.length > 0) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = Integer.parseInt(scan.next());
                }
            }
            scan.close();

            System.out.println(arrayToString(array));
        }
    }

    public static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("The values: [");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i] + ", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }
}
