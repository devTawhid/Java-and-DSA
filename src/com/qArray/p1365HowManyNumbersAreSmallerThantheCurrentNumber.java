package com.qArray;

import java.util.Arrays;

public class p1365HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
//        System.out.println(Arrays.toString(smallerNumbersThanCurrent_bf(nums)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    static int[] smallerNumbersThanCurrent_bf(int[] nums) {
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j] && i != j){
                    output[i]++;
                }
            }
        }
        return output;
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        int maxVal = 0;
        for (int i = 0; i < nums.length; i++) {
            maxVal = Math.max(maxVal, nums[i]);
        }
        int[] count = new int[maxVal + 1];

        for (int i = 0; i < nums.length; i++) {
            if(count[nums[i]] == 0){
                count[nums[i]] = 1;
            }else count[nums[i]]++;
        }

        // running sum of count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }

        // creating the output array
        for (int i = 0; i < output.length; i++) {
            if(nums[i] != 0){
                output[i] = count[nums[i] - 1];
            }else output[i] = 0;
        }

        return output;
    }
}
