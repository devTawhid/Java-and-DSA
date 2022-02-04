package com.qBinarySearch;

//https://leetcode.com/problems/split-array-largest-sum/
public class aQ8p410SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = new int[]{7,2,5,10,8};
        int val = splitArray(nums,2);
        System.out.println(val);
    }
    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int pices = 1;
            int sum = 0;
            for (int num : nums) {
                if(num + sum > mid) {
                    sum = num;
                    pices++;
                }else sum += num;
            }

            if(pices > m) start = mid + 1;
            else end = mid;
        }
        return start;
    }
}
