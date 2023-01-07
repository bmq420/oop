package com.homework3;

import java.util.Scanner;

//Exercise 1.8. WordGuess
public class WordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String word = scan.next();

        guessWord(word, scan);
        scan.close();
    }

    public static void guessWord(String word, Scanner scan) {
        int count = 0;
        String input = "";
        String guess = "";

        for (int i = 0; i < word.length(); i++) {
            guess += "_";
        }

        while (!guess.equals(word)) {
            System.out.print("Key in one character or your guess word: ");
            input = scan.next();
            count++;
            if (input.equals(word)) {
                break;
            }
            System.out.print("Trial " + count + ": ");
            for (int i = 0; i < word.length(); i++) {
                if (input.equals(String.valueOf(word.charAt(i)))) {
                    guess = guess.substring(0, i) + input + guess.substring(i + 1);
                }
            }
            System.out.println(guess);
        }
        System.out.println("Congratulation!");
        System.out.print("You got in " + count + " trials");
    }
}
