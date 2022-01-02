package com.test.interview;

import java.util.Arrays;

/**
 * Problem Statement:
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 *
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 *
 * Example 1:
 *
 *
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 */
public class RotateImage {

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        printMatrix(matrix);
        System.out.println("\n");
        rotate(matrix);
        printMatrix(matrix);
    }

    public static void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i =0; i<rows; i++) {
            for(int j=0; j<cols/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][cols-1-j];
                matrix[i][cols-1-j] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i =0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
