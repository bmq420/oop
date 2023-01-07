package com.homework1.exercise2;

import java.util.Scanner;

//Exercise 2.6. ExchangeCipher
public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String input = scan.next().toUpperCase();
        scan.close();
        convertCode(input);
    }

    public static void convertCode(String input) {
        int cipherTextChar = 'A' + 'Z';
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            int plainTextChar = input.charAt(i);
            result += String.valueOf(Character.toChars(cipherTextChar - plainTextChar));
        }

        System.out.println("The ciphertex string is: " + result);
    }
}
