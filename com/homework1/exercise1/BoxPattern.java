package com.homework1.exercise1;

import java.util.Scanner;

//Exercise 1.5. BoxPattern
public class BoxPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = Integer.parseInt(scan.next());

        drawSquarePattern(size);
        System.out.println("(a)\n");

        drawRightCrossPattern(size);
        System.out.println("(b)\n");

        drawLeftCrossPattern(size);
        System.out.println("(c)\n");

        drawDoubleCrossPattern(size);
        System.out.println("(d)");

        scan.close();
    }

    //a
    public static void drawSquarePattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || col == 1 || row == size || col == size) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //b
    public static void drawRightCrossPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    //c
    public static void drawLeftCrossPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == size - col + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawDoubleCrossPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == col || row == size - col + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
