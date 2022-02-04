package com.qBinarySearch;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class aQ5p852PeakIndexinaMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(peakIndexInMountainArray(arr));
    }

    /**
     * MountainArray
     * @param arr: array
     * @return the index value
     */
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1]) start = mid + 1;
            else end = mid;
        }
        return start; // or end
    }
}
