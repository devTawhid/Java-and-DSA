package com.qSorting;

import java.util.Arrays;

public class p1608SpecialArrayWithXElementsGreaterThanorEqualX {
    public static void main(String[] args) {
        int[] nums = {2,3,0,2};
        System.out.println(specialArray(nums));
    }
    static int specialArray(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i <= nums.length; i++) {
            if(valueCount(nums, i) == i)
                return i;
        }
        return -1;
    }

    static int valueCount(int[] nums, int target) {
        // edge cases
        if(target <= nums[0])
            return nums.length;
        if(target > nums[nums.length - 1])
            return 0;

        // the ceil finding binary search
        int start = 0, end = nums.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target == nums[mid])
                end = mid - 1;  // to find the first occurance
            else if(target > nums[mid])
                start = mid + 1;
            else if(target < nums[mid])
                end = mid - 1;
            else
                break;
        }
        return nums.length - start;
    }
}
