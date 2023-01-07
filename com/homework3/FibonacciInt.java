package com.homework3;

//Exercise 1.5. FibonacciInt (Handling Overflow)
public class FibonacciInt {
    public static void main(String[] args) {
        System.out.println("-> Fibonacci series: ");
        findFibonacciInt();

        System.out.println("-> Tribonacci series: ");
        findTribonacciInt();
    }

    public static void findFibonacciInt() {
        int count = 0;
        int result = 0;
        int fn_1 = 0;
        int fn_2 = 1;
        while (Integer.MAX_VALUE - fn_1 > fn_2) {
            System.out.println("F(" + count +  ") = " + result);
            fn_1 = fn_2;
            fn_2 = result;
            result = fn_1 + fn_2;
            count++;
        }
        System.out.println("F(" + count + ") is out of the range of int");
    }

    public static void findTribonacciInt() {
        int count = 0;
        int result = 0;
        int fn_1 = 0;
        int fn_2 = 1;
        int fn_3 = 0;
        while (Integer.MAX_VALUE - fn_1 - fn_2 > fn_3) {
            System.out.println("F(" + count +") = " + result);
            fn_1 = fn_2;
            fn_2 = fn_3;
            fn_3 = result;
            result = fn_1 + fn_2 + fn_3;
            count++;
        }
        System.out.println("F(" + count + ") is out of the range of long");
    }

}
