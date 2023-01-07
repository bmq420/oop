package com.lab2.exercise2;

import java.util.Scanner;

//Exercise 2.3. print()
public class Print {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Integer Array");
        System.out.print("Enter the length of array: ");
        int intArrayLength = Integer.parseInt(scan.next());
        int[] intArray = new int[intArrayLength];

        if (intArrayLength == 0) {
            System.out.println("The values: []");
        } else {
            System.out.print("Enter the value of all elements (separated by space): ");
            if (intArray.length > 0) {
                for (int i = 0; i < intArray.length; i++) {
                    intArray[i] = Integer.parseInt(scan.next());
                }
            }
            print(intArray);
        }

        System.out.println("Double Array");
        System.out.print("Enter the length of array: ");
        int doubleArrayLength = Integer.parseInt(scan.next());
        double[] doubleArray = new double[doubleArrayLength];

        if (doubleArrayLength == 0) {
            System.out.println("The values: []");
        } else {
            System.out.print("Enter the value of all elements (separated by space): ");
            if (doubleArray.length > 0) {
                for (int i = 0; i < doubleArray.length; i++) {
                    doubleArray[i] = Double.parseDouble(scan.next());
                }
            }
            print(doubleArray);
        }

        System.out.println("Float Array");
        System.out.print("Enter the length of array: ");
        int floatArrayLength = Integer.parseInt(scan.next());
        float[] floatArray = new float[floatArrayLength];

        if (floatArrayLength == 0) {
            System.out.println("The values: []");
        } else {
            System.out.print("Enter the value of all elements (separated by space): ");
            if (floatArray.length > 0) {
                for (int i = 0; i < floatArray.length; i++) {
                    floatArray[i] = Float.parseFloat(scan.next());
                }
            }
            print(floatArray);
        }

        scan.close();
    }

    public static void print(int[] array) {
        if (array.length == 1) {
            System.out.println("The values: [" + array[0] + "]");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("The values: [" + array[i]);
            } else if (i == array.length - 1) {
                System.out.println(", " + array[i] + "]");
            } else {
                System.out.print(", " + array[i]);
            }
        }
    }

    public static void print(double[] array) {
        if (array.length == 1) {
            System.out.println("The values: [" + array[0] + "]");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("The values: [" + array[i]);
            } else if (i == array.length - 1) {
                System.out.println(", " + array[i] + "]");
            } else {
                System.out.print(", " + array[i]);
            }
        }
    }

    public static void print(float[] array) {
        if (array.length == 1) {
            System.out.println("The values: [" + array[0] + "]");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("The values: [" + array[i]);
            } else if (i == array.length - 1) {
                System.out.println(", " + array[i] + "]");
            } else {
                System.out.print(", " + array[i]);
            }
        }
    }
}
