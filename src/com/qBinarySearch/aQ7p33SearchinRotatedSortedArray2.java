package com.qBinarySearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class aQ7p33SearchinRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {3,5,1};
        int target = 3;
        int output = search(nums, target);
        System.out.println(output);
    }
    // to run the other two function below
    static int search(int[] nums, int target) {
        int pivot = pivot(nums);
        // case 1
        if(pivot == -1) return binarySearch(nums, target, 0, nums.length - 1);
        // case 2
        if(target == nums[pivot]) return pivot;
        // case 3
        if(target < nums[0]) return binarySearch(nums, target, pivot + 1, nums.length - 1);
        // case 4
        return binarySearch(nums, target, 0, pivot - 1);
    }
    // finding the pivot
    static int pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid + 1]) return mid;
            if(mid > start && nums[mid] < nums[mid - 1]) return mid - 1;
            if(nums[mid] <= nums[start]) end = mid - 1;
            if(nums[mid] >= nums[start]) start = mid + 1;
        }
        return -1;
    }
    // the actual search is happening
    static int binarySearch(int[] nums, int target, int start, int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target) start = mid + 1;
            if(nums[mid] > target) end = mid - 1;
        }
        return -1;
    }
}
