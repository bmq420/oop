package com.homework1.exercise2;

import java.util.Scanner;

//Exersise 2.2. CountVowelsDigits
public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scan.next().toLowerCase();
        scan.close();
        count(input);
    }

    public static void count(String input) {
        int inputLength = input.length();
        int countDigit = 0;
        int countVowel = 0;
        for (int i = 0; i < inputLength; i++) {
            if (Character.isDigit(input.charAt(i))) {
                countDigit++;
            }
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                countVowel++;
            }
        }

        double digitPer =  ((double)countDigit / inputLength) * 100;
        double vowelPer =  ((double)countVowel / inputLength) * 100;

        System.out.printf("Number of vowels: %d (%.2f%%)\n", countVowel, vowelPer);
        System.out.printf("Number of digits: %d (%.2f%%)", countDigit, digitPer);
    }
}
