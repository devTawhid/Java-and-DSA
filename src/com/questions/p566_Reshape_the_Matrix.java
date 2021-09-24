package com.questions;

import java.util.Arrays;

public class p566_Reshape_the_Matrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,3,4}};
        int[][] newMat = matrixReshape(mat, 8, 2);
        System.out.println(Arrays.deepToString(newMat));
    }

    /**
     * a function to reshape matrix using original data
     * link: https://leetcode.com/problems/reshape-the-matrix/
     * @param mat: the matrix need to be reshaped
     * @param r: desired row number
     * @param c: desired col number
     * @return the changed matrix or if not possible then the original matrix
     */
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[] newMat = new int[mat.length * mat[0].length];
        int[][] m = new int[r][c];

        if(mat.length * mat[0].length != r*c){
            return mat;
        }
        // if mat = [[1, 2, 3], [4, 3, 4]]
        //this for loop outputs a plane array [1, 2, 3, 4, 3, 4]
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                newMat[mat[i].length*i+j] = mat[i][j]; // trick to make 2d array to 1d is [olLength*i+j] = [i][j]
            }
        }

        // if r = 3; c = 2
        //this for loop outputs the result [[1, 2], [3, 4], [3, 4]]
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = newMat[count];
                count++;
            }
        }

//        System.out.println(Arrays.toString(newMat));
        return  m;
    }
}
