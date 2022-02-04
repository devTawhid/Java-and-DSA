package com.qArray;

import java.util.Arrays;

public class p867_Transpose_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] tr = transpose(matrix);
//        System.out.println(tr);
    }

    /**
     * transposes a matrix
     * @param matrix: the matrix to be transformed
     * @return the transformed matrix
     */
    static int[][] transpose(int[][] matrix) {
        int[][] tr = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < tr.length; i++) {
            for (int j = 0; j < tr[0].length; j++) {
//                tr[i][j] = matrix[j][matrix[0].length - 1 - i];
                tr[i][j] = matrix[j][i];
            }
        }
        for (int[] mat: tr) {
            System.out.println(Arrays.toString(mat));
        }
        return tr;
    }
}
