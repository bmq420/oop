package com.lab1.exercise3;

import java.util.Scanner;

//Exercise 3.5. ExtractDigits
public class ExtractDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.next());
        extractDigit(number);
        scan.close();
    }

    public static void extractDigit(int number) {
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number = number / 10;
        }
    }
}
