package com.qBinarySearch;

//https://leetcode.com/problems/find-in-mountain-array/
public class aQ6p1095FindinMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int peak = peakFind(arr);
        int val = binarySearch(arr,0,peak, target);
        if(val == -1){
            val = binarySearch(arr,peak,arr.length, target);
        }
        System.out.println(val);

    }

    //finding the peak first
    static int peakFind(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid+1]) start = mid + 1;
            else end = mid;
        }
        return start;
    }

    //binary search
    static int binarySearch(int[] arr, int start, int end, int target){
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
