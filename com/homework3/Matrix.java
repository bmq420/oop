package com.homework3;

import java.util.Random;

//Exercise 1.1. Matrices(2D Array)
public class Matrix {
    static Random ran = new Random();
    static final int BOUND = 100;
    static final int ROW_BOUND = 3;
    static final int COL_BOUND = 3;

    public static void main(String[] args) {
        int rowsMatrix1 = ran.nextInt(ROW_BOUND) + 1;
        int colsMatrix1 = ran.nextInt(COL_BOUND) + 1;
        int rowsMatrix2 = ran.nextInt(ROW_BOUND) + 1;
        int colsMatrix2 = ran.nextInt(COL_BOUND) + 1;

        //Integer matrices
        int[][] intMatrix1 = createRandomIntMatrix(rowsMatrix1, colsMatrix1);
        createRandomIntMatrix(intMatrix1);
        int[][] intMatrix2 = createRandomIntMatrix(rowsMatrix2, colsMatrix2);
        createRandomIntMatrix(intMatrix2);

        System.out.println("Print randomly generated int matrix 1: ");
        print(intMatrix1);
        System.out.println("Print randomly generated int matrix 2: ");
        print(intMatrix2);

        System.out.println("Add 2 int matrices: ");
        print(add(intMatrix1, intMatrix2));
        System.out.println("Substract 2 int matrices: ");
        print(substract(intMatrix1, intMatrix2));
        System.out.println("Multiply 2 int matrices: ");
        print(multiply(intMatrix1, intMatrix2));

        System.out.println();
        //Double matrices
        double[][] douMatrix1 = createRandomDouMatrix(rowsMatrix1, colsMatrix1);
        createRandomDouMatrix(douMatrix1);
        double[][] douMatrix2 = createRandomDouMatrix(rowsMatrix2, colsMatrix2);
        createRandomDouMatrix(douMatrix2);

        System.out.println("Print randomly generated double matrix 1: ");
        print(douMatrix1);
        System.out.println("Print randomly generated double matrix 2: ");
        print(douMatrix2);

        System.out.println("Add 2 double matrices: ");
        print(add(douMatrix1, douMatrix2));
        System.out.println("Substract 2 double matrices: ");
        print(substract(douMatrix1, douMatrix2));
        System.out.println("Multiply 2 double matrices: ");
        print(multiply(douMatrix1, douMatrix2));
    }

    public static boolean isValid(int[][] matrix) {
        if (matrix != null) {
            return true;
        }
        return false;
    }

    public static boolean isValid(double[][] matrix) {
        if (matrix != null) {
            return true;
        }
        return false;
    }

    public static void createRandomIntMatrix(int[][] matrix) {
        if (!isValid(matrix)) {
            return;
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = ran.nextInt(BOUND);
            }
        }
    }

    public static int[][] createRandomIntMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        return matrix;
    }

    public static void createRandomDouMatrix(double[][] matrix) {
        if (!isValid(matrix)) {
            return;
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = Math.round(ran.nextDouble() * BOUND * 100.0) / 100.0;
            }
        }
    }

    public static double[][] createRandomDouMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        return matrix;
    }

    public static void print(int[][] matrix) {
        if (!isValid(matrix)) {
            return;
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%8d", matrix[row][col]);
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        if (!isValid(matrix)) {
            return;
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%8.2f", matrix[row][col]);
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (!isValid(matrix1) || !isValid(matrix2)) {
            return false;
        }
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (!isValid(matrix1) || !isValid(matrix2)) {
            return false;
        }
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (!isValid(matrix1) || !isValid(matrix2)) {
            return null;
        }
        int[][] result = new int[matrix1.length][matrix1[0].length];
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("-> Matrix 1 can't be added to matrix 2.");
            return null;
        }
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                result[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return result;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (!isValid(matrix1) || !isValid(matrix2)) {
            return null;
        }
        double[][] result = new double[matrix1.length][matrix1[0].length];
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("-> Matrix 1 can't be added to matrix 2.");
            return null;
        }
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                result[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return result;
    }

    public static int[][] substract(int[][] matrix1, int[][] matrix2) {
        if (!isValid(matrix1) || !isValid(matrix2)) {
            return null;
        }
        int[][] result = new int[matrix1.length][matrix1[0].length];
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("-> Matrix 1 can't be added to matrix 2.");
            return null;
        }
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                result[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return result;
    }

    public static double[][] substract(double[][] matrix1, double[][] matrix2) {
        if (!isValid(matrix1) || !isValid(matrix2)) {
            return null;
        }
        double[][] result = new double[matrix1.length][matrix1[0].length];
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("-> Matrix 1 can't be added to matrix 2.");
            return null;
        }
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                result[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return result;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (!isValid(matrix1) || !isValid(matrix2)) {
            return null;
        }
        int[][] result = new int[matrix1.length][matrix2[0].length];
        if (!checkMultiply(matrix1, matrix2)) {
            System.out.println("-> Matrix 1 can't be multiplied with matrix 2.");
            return null;
        }
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                for (int i = 0; i < matrix1[0].length; i++) {
                    result[row][col] += matrix1[row][i] * matrix2[i][col];
                }
            }
        }
        return result;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (!isValid(matrix1) || !isValid(matrix2)) {
            return null;
        }
        double[][] result = new double[matrix1.length][matrix2[0].length];
        if (!checkMultiply(matrix1, matrix2)) {
            System.out.println("-> Matrix 1 can't be multiplied with matrix 2.");
            return null;
        }
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                for (int i = 0; i < matrix1[0].length; i++) {
                    result[row][col] += matrix1[row][i] * matrix2[i][col];
                }
            }
        }
        return result;
    }

    public static boolean checkMultiply(int[][] matrix1, int[][] matrix2) {
        if (!isValid(matrix1) || !isValid(matrix2)) {
            return false;
        }
        return matrix1.length == matrix2[0].length && matrix1[0].length == matrix2.length;
    }

    public static boolean checkMultiply(double[][] matrix1, double[][] matrix2) {
        if (!isValid(matrix1) || !isValid(matrix2)) {
            return false;
        }
        return matrix1.length == matrix2[0].length && matrix1[0].length == matrix2.length;
    }
}
