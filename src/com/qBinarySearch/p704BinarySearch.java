package com.qBinarySearch;

public class p704BinarySearch {
    public static void main(String[] args) {
     int[] nums = {-1,0,3,5,9,12};
     search(nums,13);
    }
    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                System.out.println(mid);
                return mid;
            }
            if(nums[mid] > target) {
                end = mid - 1;
            }
            if(nums[mid] < target) {
                start = mid + 1;
            }
        }
        System.out.println("Not found");
        return -1;
    }
}
