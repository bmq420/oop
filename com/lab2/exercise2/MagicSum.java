package com.lab2.exercise2;

import java.util.Scanner;

//Exercise 2.2. hasEight()
public class MagicSum {
    static final int SENTINEL = -1;

    public static void main(String[] args) {
        int number = 0;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        while (number != SENTINEL) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = Integer.parseInt(scan.next());
            if (hasEight(number)) {
                sum += number;
            }
        }
        scan.close();

        System.out.println("The magic sum is: " + sum);
    }

    public static boolean hasEight(int number) {
        int digit = 0;

        while (number != 0) {
            digit = number % 10;
            if (digit == 8) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}
