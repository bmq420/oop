package com.homework1.exercise2;

import java.util.Scanner;

//Exercise 2.5. Decipher Caesar's Code
public class DecipherCaesarsCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String input = scan.nextLine().toUpperCase();
        scan.close();
        convertCode(input);
    }

    public static void convertCode(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != 'A' && input.charAt(i) != 'B' && input.charAt(i) != 'C') {
                result += (char) (input.charAt(i) - 3);
            } else if (input.charAt(i) == 'A') {
                result += 'X';
            } else if (input.charAt(i) == 'B') {
                result += 'Y';
            } else {
                result += 'Z';
            }
        }
        System.out.println("The plaintext string is: " + result);
    }
}
