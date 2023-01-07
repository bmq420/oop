package com.lab2.exercise1;

import java.util.Scanner;

//Exercise 1.4. Hex2Bin
public class Hex2Bin {
    static final String[] HEX_BITS = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal string: ");
        String input = scan.next().toLowerCase();
        scan.close();

        System.out.print("The equivalent binary for hexadecimal \"" + input + "\" is: " + getResult(input));
    }

    public static String getResult(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result += convertHex2Bin(input.charAt(i)) + " ";
        }
        return result;
    }

    public static String convertHex2Bin(char word) {
        String convert = "";
        for (int i = 0; i < HEX_BITS.length; i++) {
            if (Character.isDigit(word)) {
                convert += HEX_BITS[Character.getNumericValue(word)];
                break;
            } else {
                if (word - 87 > 15) {
                    return null;
                }
                convert += HEX_BITS[word - 87];
                break;
            }
        }
        return convert;
    }
}
