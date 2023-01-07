package com.homework1.exercise2;

import java.util.Scanner;

//Exercise 2.7. TestPalindromicWord and TestPalindromicPhrase
public class TestPalindromic {
    public static void main(String[] args) {
        Scanner scanWord = new Scanner(System.in);

        System.out.println("1. Check palindromic word");
        System.out.print("Enter your word: ");
        String inputWord = scanWord.next().toUpperCase();
        String wordResult = (testPalindromicWord(inputWord)) ? inputWord + " is a palindrome" : inputWord + " is not a palindrome";
        System.out.println(wordResult);

        Scanner scanPhrase = new Scanner(System.in);

        System.out.println("2. Check palindromic phrase: ");
        System.out.print("Enter your phrase: ");
        String inputPhrase = "";
        inputPhrase += scanPhrase.nextLine().toUpperCase();
        String phraseResult = (testPalindromicPhrase(inputPhrase)) ? inputPhrase + " is a palindrome" : inputPhrase + " is not a palindrome";
        System.out.println(phraseResult);
    }

    //1
    public static boolean testPalindromicWord(String inputWord) {
        int length = inputWord.length();
        int fIdx = 0;
        int bIdx = length - 1;

        while (bIdx > fIdx) {
            if (!Character.isLetter(inputWord.charAt(fIdx))) {
                fIdx++;
                continue;
            } else if (!Character.isLetter(inputWord.charAt(bIdx))) {
                bIdx--;
                continue;
            } else {
                char forwardChar = inputWord.charAt(fIdx++);
                char backwardChar = inputWord.charAt(bIdx--);
                if (forwardChar != backwardChar) {
                    return false;
                }
            }
        }
        return true;
    }

    //2
    public static boolean testPalindromicPhrase(String inputPhrase) {
        inputPhrase.trim();
        int length = inputPhrase.length();
        int fIdx = 0;
        int bIdx = length - 1;

        while (bIdx > fIdx) {
            if (!Character.isLetter(inputPhrase.charAt(fIdx))) {
                fIdx++;
                continue;
            } else if (!Character.isLetter(inputPhrase.charAt(bIdx))) {
                bIdx--;
                continue;
            } else {
                char forwardChar = inputPhrase.charAt(fIdx++);
                char backwardChar = inputPhrase.charAt(bIdx--);
                if (forwardChar != backwardChar) {
                    return false;
                }
            }
        }
        return true;
    }
}
