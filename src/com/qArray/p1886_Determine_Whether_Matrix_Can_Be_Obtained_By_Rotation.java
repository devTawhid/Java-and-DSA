package com.qArray;

public class p1886_Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation {
    public static void main(String[] args) {
        int[][] mat = {{1,1},{0,1}};
        int[][] target = {{0,0},{1,0}};
//        int[][] mat = {{0, 0, 0},{0, 1, 0},{1, 1, 1}};
//        int[][] target = {{1,0},{0,1}};
//        int[][] target = {{1,0,0},{1,1,0},{1,0,0}};
        boolean result = findRotation(mat, target);
        System.out.println(result);
    }

    /**
     * determines if the rotation is valid or not
     * link: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
     * @param mat: the given matrix
     * @param target: after 90 degree rotation if we can achieve this target
     * @return if possible return true else false
     */
    static boolean findRotation(int[][] mat, int[][] target) {
        int n = target.length;
        boolean test1 = true, test2 = true, test3 = true, test4 = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 90 * 0 degree
                if(target[i][j] != mat[i][j]) test1 = false;
                // 90 * 1 degree
                if(target[i][j] != mat[j][n - 1 - i]) test2 = false;
                // 90 * 2 degree
                if(target[i][j] != mat[n - 1 - i][n - 1 - j]) test3 = false;
                // 90 * 3 degree
                if(target[i][j] != mat[n - 1 - j][i]) test4 = false;//copied
            }
        }

        return test1 || test2 || test3 || test4;
    }
}