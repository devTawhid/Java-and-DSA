package com.qBinarySearch;

import java.util.Arrays;

public class aQ9p2Darray {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},
                       {15,25,35,45},
                       {28,29,37,49},
                       {33,34,38,50}};

        int[][] arr2 = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        twoDsearchSorted(arr, 12);
//        System.out.println(Arrays.toString(twoDsearch(arr, 37)));
    }

    /**
     * row wise and colum wise sorted
     * @param arr: the 2d matrix
     * @param target: the value need to be searched
     * @return the position of the target value
     */
    static int[] twoDsearch(int[][] arr, int target){
        int r = 0;
        int c = arr.length - 1;
        while (r < arr.length && c >= 0) {
            if(arr[r][c] == target) return new int[]{r, c};
            if(arr[r][c] < target) r++;
            if(arr[r][c] > target) c--;
        }
        return new int[]{-1, -1};
    }

    /**
     * the matrix is sorted from start to end
     * @param arr: the 2d matrix
     * @param target: the value need to be searched
     * @return the postion of the target value
     */
    static int[] twoDsearchSorted(int[][] arr, int target){
        int rStart = 0;
        int rEnd = arr.length - 1;
        int cMid = (arr[0].length / 2);
        while (rStart < rEnd) {
            int rMid = rStart + (rEnd - rStart) / 2;
            if(arr[rMid][cMid] == target) return new int[]{rMid, cMid};
            if(arr[rMid][cMid] < target) rStart = rMid;
            if(arr[rMid][cMid] > target) rEnd = rMid;
        }
        System.out.println(rStart + " " + rEnd);
        return new int[]{-1, -1};
    } // incomplete
    static int[] binarySearch(int[][] arr, int start, int end, int target, int row){
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(arr[row][mid] == target) return new int[]{row, mid};
            if(arr[row][mid] < target) start = mid + 1;
            if(arr[row][mid] > target) end = mid - 1;
        }
        return new int[]{-1, -1};
    }
}
