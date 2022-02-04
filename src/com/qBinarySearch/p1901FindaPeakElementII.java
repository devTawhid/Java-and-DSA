package com.qBinarySearch;

import java.util.Arrays;

public class p1901FindaPeakElementII {

    public static void main(String[] args) {
        int[][] mat = {{1,3},{4,2}};
//        int[] res = findPeakGrid(mat);
        int[] res = findPeakGrid_Greedy(mat);
        System.out.println(Arrays.toString(res));
    }

    static int[] findPeakGrid(int[][] mat) {
        int[] res = findPeakGridHelper(mat);
        if(res.length == 0)
            res = findPeakGridHelper_(mat);
        return res;
    }

    static int[] findPeakGridHelper(int[][] mat) {
        int nCol = 0;
        int row = mat.length;
        int col = mat[0].length;

        if(col == 1 && row != 1) {
            nCol = binarySearchRow(mat);
            return new int[]{0 ,nCol};
        }
        for (int i = 0; i < row; i++) {
            nCol = findPeakElement(mat[i]);

            if(i != 0 && i != row - 1)
                if(mat[i][nCol] > mat[i - 1][nCol] && mat[i][nCol] > mat[i + 1][nCol])
                    return new int[]{i, nCol};
            if(i == 0)
                if(mat[i][nCol] > mat[i + 1][nCol])
                    return new int[]{i, nCol};
            if(i == row - 1)
                if(mat[i][nCol] > mat[i - 1][nCol])
                    return new int[]{i, nCol};
        }
        return new int[]{};
    }

    static int findPeakElement(int[] nums) {
        // edge cases
        if(nums.length == 1)
            return 0;
        if(nums[0] > nums[1])
            return 0;
        if(nums[nums.length - 1] > nums[nums.length - 2])
            return nums.length - 1;

        //binary search
        int start = 0;
        int end = nums.length - 1; //here was the issue
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid != 0 && mid != nums.length - 1)
                if ( nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1] )
                    return mid;
                else if(nums[mid] < nums[mid + 1])
                    start = mid;
                else if(nums[mid] < nums[mid - 1])
                    end = mid;
        }
        return 0;
    }

    static int[] findPeakGridHelper_(int[][] mat) {
        int nCol = 0;
        int row = mat.length;
        int col = mat[0].length;

        if(col == 1 && row != 1) {
            nCol = binarySearchRow(mat);
            return new int[]{0 ,nCol};
        }
        for (int i = 0; i < row; i++) {
            nCol = findPeakElement_(mat[i]);

            if(i != 0 && i != row - 1)
                if(mat[i][nCol] > mat[i - 1][nCol] && mat[i][nCol] > mat[i + 1][nCol])
                    return new int[]{i, nCol};
            if(i == 0)
                if(mat[i][nCol] > mat[i + 1][nCol])
                    return new int[]{i, nCol};
            if(i == row - 1)
                if(mat[i][nCol] > mat[i - 1][nCol])
                    return new int[]{i, nCol};
        }
        return new int[]{};
    }

    static int findPeakElement_(int[] nums) {
        // edge cases
        if(nums.length == 1)
            return 0;
        if(nums[0] > nums[1])
            return 0;

        //binary search
        int start = 0;
        int end = nums.length - 1; //here was the issue
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid != 0 && mid != nums.length - 1)
                if ( nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1] )
                    return mid;
            if(nums[mid] < nums[mid + 1])
                if(nums[mid + 1] > nums[mid - 1])
                    start = mid;
            if(nums[mid] < nums[mid - 1])
                if(nums[mid + 1] < nums[mid - 1])
                    end = mid;
        }
        if(nums[nums.length - 1] > nums[nums.length - 2])
            return nums.length - 1;
        return 0;
    }

    static int binarySearchRow(int[][] nums) {
        // edge cases
        if(nums[0][0] > nums[1][0])
            return 0;
        if(nums[nums.length - 1][0] > nums[nums.length - 2][0])
            return nums.length - 1;

        int start = 0;
        int end = nums.length - 1; //here was the issue
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid != 0 && mid != nums[0].length - 1)
                if ( nums[mid][0] > nums[mid + 1][0] && nums[mid][0] > nums[mid - 1][0] )
                    return mid;
                else if(nums[mid][0] < nums[mid + 1][0])
                    start = mid;
                else if(nums[mid][0] < nums[mid - 1][0])
                    end = mid;
        }
        return 0;
    }


    // Another code
    static int[] findPeakGrid_Greedy(int[][] mat) {
        int i = 0, j = 0;

        while (true) {
            int current = mat[i][j];

            int up = i != 0 ? mat[i - 1][j]: 0;
            int down = i != mat.length - 1? mat[i + 1][j]: 0;
            int left = j != 0 ? mat[i][j - 1]: 0;
            int right = j != mat[0].length - 1? mat[i][j + 1]: 0;

            if(up > current)
                i = i - 1;
            else if(down > current)
                i = i + 1;
            else if(left > current)
                j = j - 1;
            else if(right > current)
                j = j + 1;
            else
                return new int[]{i, j};
        }
    }
}
