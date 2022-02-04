package com.qArray;

import java.util.Arrays;

public class p238ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
//        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelf2(nums)));
    }

    /**
     * solution: 1 using two extra array
     * @param nums
     * @return
     */
    static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int val = 1;
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if(i == 0) val = 1;
            else val *= nums[i - 1];
            leftArr[i] = val;
        }
        val = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if(i == nums.length - 1) val = 1;
            else val *= nums[i + 1];
            rightArr[i] = val;
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftArr[i] * rightArr[i];
        }
        return result;
    }


    /**
     * solution: 1 using no extra array
     * @param nums
     * @return
     */
    static int[] productExceptSelf2(int[] nums) {
        int[] result = new int[nums.length];
        int val = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if(i == nums.length - 1) val = 1;
            else val *= nums[i + 1];
            result[i] = val;
        }
        val = 1;
        for (int i = 0; i < nums.length; i++) {
            if(i == 0) val = 1;
            else val *= nums[i - 1];
            result[i] *= val;
        }

        return result;
    }
}
