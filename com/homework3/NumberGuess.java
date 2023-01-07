package com.homework3;

import java.util.Scanner;

//Exercise 1.7. Number Guess
public class NumberGuess {
    static final int SECRET_NUMBER = (int)(Math.random() * 100);
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Key in your grades: ");
        int number = Integer.parseInt(scan.next());
        checkNumber(number);
        scan.close();
    }

    public static void checkNumber(int number) {
        int count = 0;
        while (true) {
            count++;
            if (number < 0 || number > 99) {
                System.out.println("Invalid number");
                number = Integer.parseInt(scan.next());
            } else if (number < SECRET_NUMBER) {
                System.out.println("Try higher");
                number = Integer.parseInt(scan.next());
            } else if (number > SECRET_NUMBER) {
                System.out.println("Try lower");
                number = Integer.parseInt(scan.next());
            } else {
                System.out.println("You got it in " + count + " trials!");
                break;
            }
        }
    }
}
