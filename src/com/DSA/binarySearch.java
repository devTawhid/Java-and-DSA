package com.DSA;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 9, 10, 15, 25, 50, 100, 200};
        int target = 25;
        int result = binarySearch(arr, 25);
        System.out.println(result);
    }

    /**
     * Program to find a value in a sorted array
     * @param arr: the arr needs to be searched
     * @param target: the value we are looking for
     * @return the index if exist else returns -1
     */
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            // calculates new mid
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                // sets new start according to the changed mid
                start = mid + 1;
            } else if (arr[mid] > target) {
                // sets new end according to the changed mid
                end = mid - 1;
                // returns the index if found
            } else return mid;
        }

        return -1;
    }
}
