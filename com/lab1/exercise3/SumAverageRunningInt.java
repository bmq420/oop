package com.lab1.exercise3;

//Exercise 3.1. SumAverageRunningInt
public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        System.out.println("For loop get result");
        usingForLoop(sum, average, LOWERBOUND, UPPERBOUND);

        System.out.println("1. While do loop get result");
        usingWhileDoLoop(sum, average, LOWERBOUND, UPPERBOUND);

        System.out.println("2. Do while loop get result");
        usingDoWhileLoop(sum, average, LOWERBOUND, UPPERBOUND);

        System.out.println("4. Sum from 111 to 8899, the average and count the numbers in the specified range");
        findSumAverageCount();

        System.out.println("5. Sum of the squares: ");
        findSumOfTheSquares(sum, LOWERBOUND, UPPERBOUND);

        System.out.println("6. Sum of the odd and even numbers and their absolute difference: ");
        findSumOfTheOddAndEven(LOWERBOUND, UPPERBOUND);
    }

    public static void usingForLoop(int sum, double average, int LOWERBOUND, int UPPERBOUND) {
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }

        average = (double) sum / (UPPERBOUND - LOWERBOUND);

        System.out.println("-> Sum: " + sum);
        System.out.println("-> Average: " + average);
    }

    //1
    public static void usingWhileDoLoop(int sum, double average, int LOWERBOUND, int UPPERBOUND) {
        int number = LOWERBOUND;

        while (number <= UPPERBOUND) {
            sum += number;
            ++number;
        }

        average = (double) sum / (UPPERBOUND - LOWERBOUND);

        System.out.println("-> Sum: " + sum);
        System.out.println("-> Average: " + average);
    }

    //2
    public static void usingDoWhileLoop(int sum, double average, int LOWERBOUND, int UPPERBOUND) {
        int number = LOWERBOUND;
        do {
            sum += number;
            ++number;
        } while (number <= UPPERBOUND);

        average = (double) sum / (UPPERBOUND - LOWERBOUND);

        System.out.println("-> Sum: " + sum);
        System.out.println("-> Average: " + average);
    }

    //4
    public static void findSumAverageCount() {
        int sum = 0;
        double average = 0;
        int LOWERBOUND2 = 111;
        int UPPERBOUND2 = 8899;
        int count = 0;

        for (int i = LOWERBOUND2; i <= UPPERBOUND2; i++) {
            sum += i;
            ++count;
        }

        average = (double) sum / count;

        System.out.println("-> Sum: " + sum);
        System.out.println("-> Average: " + average);
        System.out.println("-> Count: " + count);
    }

    //5
    public static void findSumOfTheSquares(int sum, int LOWERBOUND, int UPPERBOUND) {
        for (int i = LOWERBOUND; i<= UPPERBOUND; i++) {
            sum += i*i;
        }

        System.out.println("-> Sum of the squares: " + sum);
    }

    //6
    public static void findSumOfTheOddAndEven(int LOWERBOUND, int UPPERBOUND) {
       int sumOdd = 0;
       int sumEven = 0;
       int absDiff;

       for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
           if (number % 2 == 0) {
               sumOdd += number;
           } else {
               sumEven += number;
           }
       }

       if (sumOdd > sumEven) {
           absDiff = sumOdd - sumEven;
       } else {
           absDiff = sumEven - sumOdd;
       }

       System.out.println("-> Sum of odd numbers: " + sumOdd);
       System.out.println("-> Sum of even numbers: " + sumEven);
       System.out.println("-> Absolute difference between the two sums: " + absDiff);
    }
}
