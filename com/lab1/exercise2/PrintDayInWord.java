package com.lab1.exercise2;

import java.util.Scanner;

//Exercise 2.4. PrintDayInWord
public class PrintDayInWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your day's number: ");
        int dayNumber = Integer.parseInt(scan.next());

        System.out.print("Using nested-if statement: ");
        usingNestedIf(dayNumber);

        System.out.print("Using switch-case-default statement: ");
        usingSwitchCaseDefault(dayNumber);
        scan.close();
    }

    public static void usingNestedIf(int dayNumber) {
        if (dayNumber == 0) {
            System.out.println("Sunday");
        } else if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
        } else if (dayNumber == 4) {
            System.out.println("Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Friday");
        } else if (dayNumber == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Not a valid day");
        }
    }

    public static void usingSwitchCaseDefault(int dayNumber) {
        switch (dayNumber) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid day");
                break;
        }
    }
}
