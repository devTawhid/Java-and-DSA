package com.qSorting;

import java.util.Arrays;

public class p1030MatrixCellsinDistanceOrder {
    public static void main(String[] args) {
        allCellsDistOrder(2,3,1,2);
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
        /***********************************/
        for (int i = 0; i < res.length; i++) {
            System.out.print(Arrays.toString(res[i]));
        }
        System.out.println();
        for (int[] i: res) {
            System.out.print(Math.abs(i[0] - rCenter) + Math.abs(i[1] - cCenter) + "     ");
        }
        System.out.println();
        /***********************************/

//        for (int i = 0; i < res.length; i++) {
//            int dist1 = Math.abs(res[i][0] - rCenter) + Math.abs(res[i][1] - cCenter);
//            for (int j = i; j < res.length; j++) {
//                int dist2 = Math.abs(res[j][0] - rCenter) + Math.abs(res[j][1] - cCenter);
//                if(dist1 > dist2) {
//                    swap(res, i, j);
//                }
//            }
//        }

        Arrays.sort(res,(a, b) -> {
            int d1 = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int d2 = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return d1 - d2;
        });
        /***********************************/
        for (int i = 0; i < res.length; i++) {
            System.out.print(Arrays.toString(res[i]));
        }
        System.out.println();
        for (int[] i: res) {
            System.out.print(Math.abs(i[0] - rCenter) + Math.abs(i[1] - cCenter) + "     ");
        }
        /***********************************/
        return res;
    }

    static int[][] allCellsDistOrder_(int rows, int cols, int rCenter, int cCenter) {
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
}
