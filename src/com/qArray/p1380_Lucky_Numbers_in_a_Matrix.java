package com.qArray;

import java.util.ArrayList;
import java.util.List;

public class p1380_Lucky_Numbers_in_a_Matrix {
    public static void main(String[] args) {
//        int[][] matrix = {//c1 c2 c3 c4
//                          { 1,10, 4, 2},// row1
//                          { 9, 8, 3, 7},// row2
//                          {15,16,17,12} // row3
//                         };
//        int[][] matrix = {{3,7,8},
//                          {9,11,13},
//                          {15,16,17}
//                          };
        int[][] matrix = {{7,8},
                          {1,2}
                         };
        luckyNumbers(matrix);
    }

    static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNum = new ArrayList<>();
        int rowN = matrix.length; // lowN = number of rows in the matrix
        int colN = matrix[0].length; // colN = number of columns in the matrix
        int colMin = Integer.MAX_VALUE;
        int colMinPre = Integer.MAX_VALUE;
        int colMinIndex = 0;
        int rowMax = Integer.MIN_VALUE;

        for (int i = 0; i < rowN; i++) {
            for (int j = 0; j < colN; j++) {
                colMinPre = Math.min(matrix[i][j], colMinPre);
                if(colMin != colMinPre){
                    colMinIndex = j;
                    colMin = colMinPre;
                }
            }
//            System.out.println(colMin + " " + colMinIndex);
            for (int k = 0; k < rowN; k++) {
//                System.out.println(colMin + " " + matrix[k][colMinIndex]);
                rowMax = Math.max(matrix[k][colMinIndex], rowMax);
            }
            if(rowMax == colMin){
                luckyNum.add(colMin);
            }
            rowMax = Integer.MIN_VALUE;
            colMin = Integer.MAX_VALUE;
            colMinPre = Integer.MAX_VALUE;

        }
//        System.out.println(rowN + " " + colN);
//        System.out.println(luckyNum);
        return luckyNum;
    }
}
