package com.qBinarySearch;

//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class aQ4pfindPositionElementSortedArrayInfiniteNumbers {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 100;
        System.out.println(findPos(nums, target));
    }

    static int findPos(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while (target > nums[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] < target) start = mid + 1;
            if(nums[mid] > target) end = mid - 1;
            else return mid;
        }
        return -1;
    }
}
