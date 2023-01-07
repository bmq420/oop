package com.homework1.exercise2;

import java.util.Scanner;

//Exercise 2.3. PhoneKeyPad
public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your phone keypad: ");
        String keyPad = scan.next().toLowerCase();

        System.out.print("a. Nested-if: ");
        for (int i = 0; i < keyPad.length(); i++) {
            usingNestedIf(keyPad.charAt(i));
        }

        System.out.println();
        System.out.print("b. Switch-case-default: ");
        for (int i = 0; i < keyPad.length(); i++) {
            usingSwitchCaseDefault(keyPad.charAt(i));
        }
        scan.close();
    }

    //a
    public static void usingNestedIf(char inChar) {
        if (inChar == 'a' || inChar == 'b' || inChar == 'c') {
            System.out.print("2");
        }
        if (inChar == 'd' || inChar == 'e' || inChar == 'f') {
            System.out.print("3");
        }
        if (inChar == 'g' || inChar == 'h' || inChar == 'i') {
            System.out.print("4");
        }
        if (inChar == 'j' || inChar == 'k' || inChar == 'l') {
            System.out.print("5");
        }
        if (inChar == 'm' || inChar == 'n' || inChar == 'o') {
            System.out.print("6");
        }
        if (inChar == 'p' || inChar == 'q' || inChar == 'r' || inChar == 's') {
            System.out.print("7");
        }
        if (inChar == 't' || inChar == 'u' || inChar == 'v') {
            System.out.print("8");
        }
        if (inChar == 'w' || inChar == 'x' || inChar == 'y' || inChar == 'z') {
            System.out.print("9");
        }
    }

    //b
    public static void usingSwitchCaseDefault(char inChar) {
        switch (inChar) {
            case 'a':
            case 'b':
            case 'c':
                System.out.print("2");
                break;
            case 'd':
            case 'e':
            case 'f':
                System.out.print("3");
                break;
            case 'g':
            case 'h':
            case 'i':
                System.out.print("4");
                break;
            case 'j':
            case 'k':
            case 'l':
                System.out.print("5");
                break;
            case 'm':
            case 'n':
            case 'o':
                System.out.print("6");
                break;
            case 'p':
            case 'q':
            case 'r':
                System.out.print("7");
                break;
            case 's':
            case 't':
            case 'u':
                System.out.print("8");
                break;
            default:
                System.out.print("9");
                break;
        }
    }
}
