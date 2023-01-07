package com.lab1.exersice4;

import java.util.Scanner;

//Exercise 4.5. ReverseInt
public class ReverseInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive interger: ");
        int inNumber = Integer.parseInt(scan.next());
        findReverse(inNumber);
        scan.close();
    }

    public static void findReverse(int inNumber) {
        if (inNumber < 0) {
            System.out.println("Invalid number");
            return;
        }

        int inDigit;
        System.out.print("The reverse is: ");
        while (inNumber > 0) {
            inDigit = inNumber % 10;
            System.out.print(inDigit);
            inNumber /= 10;
        }
    }
}
