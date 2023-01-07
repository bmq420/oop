package com.homework1.exercise2;

import java.util.Scanner;

//Exercise 2.10. Hex2Dec
public class Hex2Dec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String input = scan.next();
        scan.close();
        convertString(input);
    }

    public static void convertString(String input) {
        try {
            int hexa = Integer.parseInt(input, 16);
            System.out.println("The equivalent decimal number for hexadecimal \"" + input + "\" is: " + hexa);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid hexadecimal string \"" + input + "\"");
        }
    }
}
