package com.homework1.exercise2;

import java.util.Scanner;

//Exercise 2.1. ReverseString
public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = scan.next();
        scan.close();
        reverseString(inStr);
    }

    public static void reverseString(String inStr) {
        int inStrLen = inStr.length();
        String result = "";
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            result += inStr.charAt(charIdx);
        }
        System.out.println("The reverse of the String \"" + inStr + "\" is \"" + result + "\".");
    }
}
