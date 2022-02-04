package com.qSorting;

import java.util.Arrays;

public class aQ3p287FindtheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,2,2,5,6,7};
        int res = findDuplicate(nums);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));
    }
    static int findDuplicate(int[] nums) {
        int res = 0;
        int i = 0;
        while (i < nums.length) {
            if(nums[i] != -1 && nums[i] != nums[nums[i] - 1])
                swap(nums, i, nums[i] - 1);
            else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1) {
                res = nums[j];
                break;
            }
        }

        return res;
    }

    static int findMissing(int[] nums) {
        int res = -1;
        int i = 0;
        while (i < nums.length) {
            if(nums[i] < nums.length)
                if(nums[i] != -1 && nums[i] != nums[nums[i] - 1])
                    swap(nums, i, nums[i] - 1);
                else
                    i++;
            else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1) {
                res = j + 1;
                break;
            }
        }

        return res;
    }

    static void swap(int[] arr, int i, int j) {
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }
}
