package com.lab1.exersice4;

import java.util.Scanner;

//Exercise 4.6. InputValidation
public class InputValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        checkInput(scan);
        scan.close();
    }

    public static void checkInput(Scanner scan) {
        int numberIn;
        boolean isValid;

        isValid = false;
        do {
            System.out.print("Enter a number between 0-10 or 90-100: ");
            numberIn = Integer.parseInt(scan.next());

            if (0 <= numberIn && numberIn <= 10 || 90 <= numberIn && numberIn <= 100) {
                isValid = true;
            } else {
                System.out.println("Invalid input, try again...");
            }
        } while (!isValid);

        System.out.println("You have entered: " + numberIn);

    }
}
