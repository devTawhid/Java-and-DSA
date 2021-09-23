package com.DSA;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

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

        if(arr[start] < arr[end]){
            while (start <= end){
                // calculates new mid
                int mid = start + (end - start) / 2;

                if (arr[mid] < target) {
                    // sets new start according to the changed mid
                    start = mid;
                } else if (arr[mid] > target) {
                    // sets new end according to the changed mid
                    end = mid;
                    // returns the index if found
                } else return mid;
            }
        }else {
            while (start <= end){
                // calculates new mid
                int mid = start + (end - start) / 2;

                if (arr[mid] > target) {
                    // sets new start according to the changed mid
                    start = mid;
                } else if (arr[mid] < target) {
                    // sets new end according to the changed mid
                    end = mid;
                    // returns the index if found
                } else return mid;
            }
        }

        return -1;
    }
}
