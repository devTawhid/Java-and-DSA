package com.qBinarySearch;

public class aQ1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,10,13};
        System.out.println(floorBinarySearch(arr, 9));
    }

    /**
     * floor finding
     * @param arr: the array need to be searched
     * @param target: the target
     * @return the floor value.
     */
    static int floorBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target < arr[start]) return -1 ;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) start = mid + 1;
            else if(arr[mid] > target) end = mid - 1;
        }
        return arr[end]; // <- <- <- <- <- <- <-
    }

    /**
     * ceiling finding
     * @param arr: the array need to be searched
     * @param target: the target.
     * @return the ceiling value
     */
    static int ceilBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[end]) return -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) start = mid + 1;
            else if(arr[mid] > target) end = mid - 1;
        }
        return arr[start]; // <- <- <- <- <- <- <-
    }
}
