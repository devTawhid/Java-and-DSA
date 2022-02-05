package com.qBinarySearch;

import java.util.Arrays;

public class aQ2p34FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
//        searchRange(nums, target);
        System.out.println(Arrays.toString(searchRange_(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findFirstInx(nums, target, true);
        if(result[0] != -1) {
            result[1] = findFirstInx(nums, target, false);
        }
        return result;
    }
    static int findFirstInx(int[] nums, int target, boolean findFirst) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] < target) start = mid + 1;
            if(nums[mid] > target) end = mid - 1;
            if(nums[mid] == target) {
                index = mid;
                if(findFirst) end = mid - 1;
                else start = mid + 1;
            }
        }
        return index;
    }

    // practice #1
    static int[] searchRange_(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = findFirstIndex(nums, 8, true);
        res[1] = findFirstIndex(nums, 8, false);
        return res;
    }
    static int findFirstIndex(int[] nums, int target, boolean findFirst) {
        int start = 0, end = nums.length;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if(target > nums[mid])
                start = mid + 1;
            else if(target < nums[mid])
                end = mid - 1;
            else{
                if(findFirst)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return findFirst ? start: end;
    }
}
