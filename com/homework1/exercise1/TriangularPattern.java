package com.homework1.exercise1;

import java.util.Scanner;

//Exercise 1.4. TriangularPattern
public class TriangularPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = Integer.parseInt(scan.next());

        drawBotLeftTri(size);
        System.out.println("(a)");

        drawTopLeftTri(size);
        System.out.println("(b)");

        drwaTopRightTri(size);
        System.out.println("(c)");

        drawBotRightTri(size);
        System.out.println("(d)");

        scan.close();
    }

    public static void drawBotLeftTri(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void drawTopLeftTri(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row <= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void drwaTopRightTri(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row > col) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void drawBotRightTri(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row + col >= size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
