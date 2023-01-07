package com.homework1.exercise2;

import java.util.Scanner;

//Exercise 2.4. Caesar's Code
public class CaesarsCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String input = scan.nextLine().toUpperCase();
        scan.close();
        convertCode(input);
    }

    public static void convertCode(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != 'X' && input.charAt(i) != 'Y' && input.charAt(i) != 'Z') {
                result += (char)(input.charAt(i) + 3);
            } else if (input.charAt(i) == 'X') {
                result += 'A';
            } else if (input.charAt(i) == 'Y') {
                result += 'B';
            } else {
                result += 'C';
            }
        }
        System.out.println("The ciphertext string is: " + result);
    }
}
