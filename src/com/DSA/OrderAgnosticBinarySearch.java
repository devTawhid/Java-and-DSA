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

        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;

            if(isAsc) {
                if(arr[mid] < target) start = mid + 1;
                else end = mid - 1;
            }else{
                if(arr[mid] < target) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}
