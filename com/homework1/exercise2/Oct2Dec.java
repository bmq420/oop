package com.homework1.exercise2;

import java.util.Scanner;

//Exercise 2.11. Oct2Dec
public class Oct2Dec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Octal string: ");
        String input = scan.next();
        scan.close();
        convertString(input);
    }

    public static void convertString(String input) {
        try {
            int octal = Integer.parseInt(input, 8);
            System.out.println("The equivalent decimal number for octal \"" + input + "\" is: " + octal);
        } catch (NumberFormatException e) {
            System.out.println("error: invaliid octal string \"" + input + "\"");
        }
    }
}
