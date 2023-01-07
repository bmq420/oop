package com.homework1.exercise2;

import java.util.Scanner;

//Exercise 2.9. Bin2Dec
public class Bin2Dec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String input = scan.next();
        scan.close();
        convertString(input);
    }

    public static void convertString(String input) {
        try {
            int decimal = Integer.parseInt(input, 2);
            System.out.println("The equivalent decimal number for binary \"" + input + "\" is: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid binary string \"" + input + "\"");
        }
    }
}
