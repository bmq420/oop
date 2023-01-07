package com.lab2.exercise1;

import java.util.Scanner;

//Exercise 1.5. Dec2Hex
public class Dec2Hex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int input = Integer.parseInt(scan.next());
        scan.close();

        String result = convertDec2Hex(input);
        System.out.print("The equivalent hexadecimal number is: " + result);
    }

    public static String convertDec2Hex(int input) {
        return Integer.toHexString(input).toUpperCase();
    }
}
