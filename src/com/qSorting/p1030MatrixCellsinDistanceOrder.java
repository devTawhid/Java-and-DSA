package com.qSorting;

import java.util.Arrays;

public class p1030MatrixCellsinDistanceOrder {
    public static void main(String[] args) {
        allCellsDistOrder_(2,3,1,2);
    }

    static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] res = new int[rows * cols][2];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int rowN = cols * i + j;
                res[rowN][0] = i;
                res[rowN][1] = j;
            }
        }
        Arrays.sort(res,(a, b) -> {
            int d1 = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int d2 = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return d1 - d2;
        });

        return res;
    }

    // practice #1
    static int[][] allCellsDistOrder_(int rows, int cols, int rCenter, int cCenter) {
        int[][] arr = new int[rows * cols][2];
        int[] order = new int[rows * cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i * cols + j][0] = i;
                arr[i * cols + j][1] = j;
            }
        }
        // TODO: 07-Feb-22 => create 1D array with the above for loop the array will be like this [1,2,3,4,5,6]
        Arrays.sort(arr, (a, b) -> {
            int d1 = Math.abs(a[0] - rCenter + a[1] - cCenter);
            int d2 = Math.abs(b[0] - rCenter + b[1] - cCenter);
            return d1 - d2;
        });

        return arr;
    }
}
