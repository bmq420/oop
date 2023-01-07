package com.lab1.exersice4;

import java.util.Scanner;

//Exersice 4.1. SumProductMinMax3
public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1;
        int number2;
        int number3;

        int sum;
        int product;
        int min;
        int max;

        System.out.print("Enter 1st integer: ");
        number1 = Integer.parseInt(in.next());
        System.out.print("Enter 2nd integer: ");
        number2 = Integer.parseInt(in.next());
        System.out.print("Enter 3rd integer: ");
        number3 = Integer.parseInt(in.next());
        in.close();

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;

        min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }

        max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }
}
