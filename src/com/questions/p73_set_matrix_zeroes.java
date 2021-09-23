package com.questions;


import java.util.Arrays;

public class p73_set_matrix_zeroes {
    public static void main(String[] args) {
//        Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
//        Output: [[1,0,1],[0,0,0],[1,0,1]]
        int[][] matrix = {{2, 0, 2},{2, 0, 2},{2, 1, 2}};
        setZeroes(matrix);
//        System.out.println(Arrays.toString(matrix)); // outputs [[I@e9e54c2, [I@65ab7765, [I@1b28cdfa]
//        System.out.println(Arrays.deepToString(matrix)); // but deep produces precise result.

    }

    /**
     * link: https://leetcode.com/problems/set-matrix-zeroes/
     * @param matrix: the matrix need to be changed
     */
    static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] newrow = new int[row];
        int[] newcol = new int[col];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if(matrix[r][c] == 0){
                    if(newrow[r] == 0){
                        newrow[r] = 1;
                    }
                    if(newcol[c] == 0){
                        newcol[c] = 1;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(newrow));
        System.out.println(Arrays.toString(newcol));

    }
}
