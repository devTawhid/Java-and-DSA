package com.qSorting;

import java.util.Arrays;

public class aQ1p268MissingNumber {
    public static void main(String[] args) {
        int[] nums = {8,6,4,2,3,5,7,0,1};
        int res = missingNumber(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(res);
    }
    static int missingNumber(int[] nums) {
        int i = 0;
//        while (i < nums.length - 1) {
//            if(nums[i] == 0)
//                i++;
//            else if (nums[i] != nums[nums[i] - 1])
//                swap(nums, i, nums[i] - 1);
//            else
//                i++;
//        }
        while (i < nums.length) {
            if(nums[i] < nums.length && nums[i] != nums[nums[i]]) // kunal's logic
                swap(nums, i, nums[i]);
            else
                i++;
        }
//        for(int j = 0; j < nums.length; j++ )
//            if(nums[j] == 0)
//                result = j + 1;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j)
                return j;
        }
        return nums.length;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
