package com.qArray;

import java.util.Arrays;

public class p34FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,8,8,8,8,10};
        System.out.println(Arrays.toString(searchRange2(nums,8)));

    }

    /**
     * worked but time limit exceeded.
     * @param nums: array
     * @param target: target value
     * @return: first and last index
     */
    static int[] searchRange(int[] nums, int target) {
        int mid = (int) Math.ceil((0 + nums.length) / 2);
        int[] result = {-1 , -1};
        int first = -1;
        while (nums[mid] <= target) {
            if (nums[mid] == target) {
                first = mid;
                break;
            }
            else if (nums[mid] < target) mid = (int) Math.ceil((mid) / 2);
            else if (nums[mid] > target) mid = (int) Math.ceil((mid + nums.length) / 2);
        }
        if(first != -1){
            int i = first;
            int j = first + 1;
            int prevI = -1;
            int prevJ = -1;
            while (nums[i] == target || nums[j] == target){
                if(i == prevI && j == prevJ) {
                    break;
                }
                if(nums[i - 1] == nums[i]) {
                    i--;
                    prevI = i;
                }
                if(nums[j + 1] == nums[j]) {
                    j++;
                    prevJ = j;
                }
            }
            result[0] = i;
            result[1] = j;
        }

        return result;
    }

    /**
     * efficient one
     * @param nums
     * @param target
     * @return
     */

    static int[] searchRange2(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirstIndex(nums, target);
        result[1] = findLastIndex(nums, target);
        return result;
    }

    static int findFirstIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] >= target) end = mid - 1;
            else start = mid + 1;
            if (nums[mid] == target) index = mid;
        }
        return index;
    }
    static int findLastIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] <= target) start = mid + 1;
            else end = mid - 1;
            if (nums[mid] == target) index = mid;
        }

        return index;
    }
}
