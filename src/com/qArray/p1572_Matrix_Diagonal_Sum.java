package com.qArray;

public class p1572_Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        System.out.println(diagonalSum(matrix));
    }
    static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if(i == j|| i + j == n - 1){
//                    sum += mat[i][j];
//                    System.out.println(mat[i][j]);
//                }
//            }
//        }

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
        }
        int i = 0;
        int j = n - 1;
        while (j >= 0){
            if(i != j){
                sum += mat[i][j];
            }
            i++;
            j--;
        }
        return sum;
    }
}
