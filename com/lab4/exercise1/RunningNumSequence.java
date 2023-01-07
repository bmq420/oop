package com.lab4.exercise1;

public class RunningNumSequence {
    public static void main(String[] args) {
        for (int i = 1; i <= 12 ; i++) {
            System.out.println("Length of S(" + i + ") is " + numLength(i));
        }
    }

    public static int numLength(int num) {
        if (num == 1) {
            return 1;
        }
        return numLength(num - 1) + String.valueOf(num).length();
    }
}
