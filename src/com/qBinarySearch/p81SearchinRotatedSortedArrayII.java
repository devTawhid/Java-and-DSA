package com.qBinarySearch;

import java.util.Arrays;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class p81SearchinRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        boolean res = search(nums, target);
        System.out.println(Arrays.toString(nums));
        System.out.println(res);
    }
    //[4,5,6,6,7,0,1,2,4,4]

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (target == nums[start] || target == nums[end]) return true;
            else if (target > nums[start]) {
                while (start < end && nums[start] == nums[start + 1]) {
                    start++;
                }
                start++;
            }
            else if (target < nums[end]) {
                while (start < end && nums[end - 1] == nums[end]) {
                    end--;
                }
                end--;
            }
            else {
                break;
            }
        }
        return false;
    }
}
