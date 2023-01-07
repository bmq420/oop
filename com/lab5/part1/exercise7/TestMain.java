package com.lab5.part1.exercise7;

import java.util.Scanner;

//Exercise 7 main class
public class TestMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double firstReal = Double.parseDouble(scan.next());
        double firstImag = Double.parseDouble(scan.next());
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double secondReal = Double.parseDouble(scan.next());
        double secondImag = Double.parseDouble(scan.next());
        scan.close();

        MyComplex num1 = new MyComplex(firstReal, firstImag);
        MyComplex num2 = new MyComplex(secondReal, secondImag);

        System.out.println("Number 1 is: (" + num1 + ")");
        printResult(num1);

        System.out.println("Number 2 is: (" + num2 + ")");
        printResult(num2);

        compareNum(num1, num2);

        System.out.println("(" + num1 + ") + (" + num2 + ") = (" + num1.addNew(num2) + ")");
    }

    public static void printResult(MyComplex num) {
        if (num.isReal()) {
            System.out.println("(" + num + ") is a pure real number");
        } else {
            System.out.println("(" + num + ") is NOT a pure real number");
        }
        if (num.isImaginary()) {
            System.out.println("(" + num + ") is a pure real number");
        } else {
            System.out.println("(" + num + ") is NOT a pure real number");
        }
    }

    public static void compareNum(MyComplex num1, MyComplex num2) {
        if (num1.equals(num2)) {
            System.out.println("(" + num1 + ") is equal to (" + num2 + ")");
        } else {
            System.out.println("(" + num1 + ") is NOT equal to (" + num2 + ")");
        }
    }
}
