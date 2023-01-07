package com.homework1.exercise1;

import java.util.Scanner;

//Exercise 1.6. HillPattern
public class HillPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int numOfRows = Integer.parseInt(scan.next());

        drawUpwardTri(numOfRows);
        System.out.println("(a)\n");

        drawDownwardTri(numOfRows);
        System.out.println("(b)\n");

        drawCombineTri(numOfRows);
        System.out.println("(c)\n");

        drawOppCombineTri(numOfRows);
        System.out.println("(d)");

        scan.close();
    }

    //a
    public static void drawUpwardTri(int numOfRows) {
        for (int row = 1; row <= numOfRows; row++) {
            int numOfCols = numOfRows * 2 - 1;
            for (int col = 1; col <= numOfCols; col++) {
                if (row + col >= numOfRows + 1 && row >= col - numOfRows + 1) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    //b
    public static void drawDownwardTri(int numOfRows) {
        for (int row = 1; row <= numOfRows; row++) {
            int numOfCols = numOfRows * 2 - 1;
            for (int col = 1; col <= numOfCols; col++) {
                if (row + col <= numOfCols + 1 && row <= col) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    //c
    public static void drawCombineTri(int numOfRows) {
        for (int row = 1; row <= numOfRows; row++) {
            int numOfCols = numOfRows * 2 - 1;
            for (int col = 1; col <= numOfCols; col++) {
                if (row + col >= numOfRows + 1 && row >= col - numOfRows + 1) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int row = 2; row <= numOfRows; row++) {
            int numOfCols = numOfRows * 2 - 1;
            for (int col = 1; col <= numOfCols; col++) {
                if (row + col <= numOfCols + 1 && row <= col) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    //d
    public static void drawOppCombineTri(int numOfRows) {
        for (int row = 1; row <= numOfRows; row++) {
            int numOfCols = numOfRows * 2 - 1;
            for (int col = 1; col <= numOfCols; col++) {
                if (row + col >= numOfRows + 2 && row >= col - numOfRows + 2) {
                    System.out.print("   ");
                } else {
                    System.out.print(" # ");
                }
            }
            System.out.println();
        }
        for (int row = 1; row <= numOfRows; row++) {
            int numOfCols = numOfRows * 2 - 1;
            for (int col = 1; col <= numOfCols; col++) {
                if (row + col <= numOfCols && row <= col - 1) {
                    System.out.print("   ");
                } else {
                    System.out.print(" # ");
                }
            }
            System.out.println();
        }
    }
}
