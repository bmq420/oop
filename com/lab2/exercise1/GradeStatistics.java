package com.lab2.exercise1;

import java.util.Scanner;

//Exercise 1.3. GradesStatistics
public class GradeStatistics {
    public static void main(String[] args) {
        int[] stuGrades;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStu = Integer.parseInt(scan.next());
        stuGrades = new int[numOfStu];

        for (int i = 0; i < numOfStu; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            stuGrades[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        printResult(stuGrades);
    }

    public static void printResult(int[] stuGrades) {
        double average = 0;
        int minimum = stuGrades[0];
        int maximum = 0;
        int sum = 0;

        for (int i : stuGrades) {
            sum += i;
            if (i < minimum) {
                minimum = i;
            }
            if (i > maximum) {
                maximum = i;
            }
        }
        average = (double) sum / stuGrades.length;

        System.out.printf("The average is: %.2f\nThe minimum is: %d\nThe maximum is: %d", average, minimum, maximum);
    }
}
