package com.homework3;

import java.math.BigInteger;
import java.util.Scanner;

//Exercise 1.6. Number System Conversion
public class NumberSystemConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String input = scan.next();
        System.out.print("Enter the input radix: ");
        int inRadix = Integer.parseInt(scan.next());
        System.out.print("Enter the output radix: ");
        int outRadix = Integer.parseInt(scan.next());
        scan.close();

        try {
            BigInteger convertToDec = convertNumberToDec(input, inRadix);
            String result = convertDecToRadix(String.valueOf(convertToDec), outRadix);
            System.out.println("\"" + input + "\" in radix " + inRadix + " is \"" + result + "\" in radix " + outRadix + ".");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }

    }

    public static BigInteger convertNumberToDec(String input, int inRadix) {
        BigInteger result = new BigInteger(input, inRadix);
        return result;
    }

    public static String convertDecToRadix(String input, int outRadix) {
        BigInteger result = new BigInteger(input);
        return result.toString(outRadix);
    }
}

