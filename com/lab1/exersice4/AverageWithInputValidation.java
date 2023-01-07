package com.lab1.exersice4;

import java.util.Scanner;

//Exercise 4.7. AverageWithInputValidation
public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        findAverage(scan);
        scan.close();
    }

    public static void findAverage(Scanner scan) {
        final int NUM_STUDENTS = 3;
        int numberIn;
        boolean isValid;
        int sum = 0;
        double average;

        for (int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++) {
            System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
            numberIn = Integer.parseInt(scan.next());
            isValid = false;
            do {
                if (0 <= numberIn && numberIn <= 100) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                    System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
                    numberIn = Integer.parseInt(scan.next());
                }
            } while (!isValid);
            sum += numberIn;
        }

        average = (double) sum / NUM_STUDENTS;
        System.out.printf("The average is: %.2f%n", average);
    }
}
