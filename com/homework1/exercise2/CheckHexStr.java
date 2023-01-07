package com.homework1.exercise2;

import java.util.Scanner;

//Exercise 2.8. CheckHexStr
public class CheckHexStr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String input = scan.next();
        scan.close();
        checkHexStr(input);
    }

    public static void checkHexStr(String input) {
        boolean result = true;

        for (int i = 0; i < input.length(); i++) {
            char inChar = input.charAt(i);
            if (!(inChar >= '0' && inChar <= '9' || inChar >= 'A' && inChar <= 'F' || inChar >= 'a' && inChar <= 'f')) {
                result = false;
            }
        }

        if (result) {
            System.out.println("\"" + input + "\" is a hex string");
        } else {
            System.out.println("\"" + input + "\" is NOT a hex string");
        }
    }
}
