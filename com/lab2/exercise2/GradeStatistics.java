package com.lab2.exercise2;

import java.util.Arrays;
import java.util.Scanner;

//Exercise 2.11. GradesStatistics
public class GradeStatistics {
    public static int[] grades;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        readGrades(scan);
        System.out.print("The grades are: ");
        print(grades);
        System.out.printf("The average is: %.2f\n", average(grades));
        System.out.printf("The median is: %.2f\n", median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("The standard deviation is: %.2f", stdDev(grades));
    }

    public static void readGrades(Scanner scan) {
        System.out.print("Enter the number of students: ");
        int numOfStu = Integer.parseInt(scan.next());
        grades = new int[numOfStu];

        for (int i = 0; i < numOfStu; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = Integer.parseInt(scan.next());
        }
    }

    public static void print(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (i == 0) {
                System.out.print("[" + grades[i] + ", ");
            } else if (i == grades.length - 1) {
                System.out.println(grades[i] + "]");
            } else {
                System.out.print(grades[i] + ", ");
            }
        }
    }

    public static double average(int[] grades) {
        double sum = 0;
        double average = 0;
        for (int i : grades) {
            sum += i;
        }
        average = sum / grades.length;
        return average;
    }

    public static double median(int[] grades) {
        double median = 0;

        int[] clone = grades;
        Arrays.sort(clone);

        if (clone.length % 2 == 1) {
            median = clone[clone.length / 2 - 1];
        } else {
            median =  (double) (clone[clone.length / 2 - 1] + clone[clone.length / 2]) / 2;
        }
        return median;
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static int min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static double stdDev(int[] array) {
        double stdDev = 0;
        double check = 0;
        double mean = average(array);

        for (int i = 0; i < array.length; i++) {
            check += Math.pow(array[i], 2) - Math.pow(mean, 2);
        }
        stdDev = Math.sqrt(check / array.length);

        return stdDev;
    }
}
