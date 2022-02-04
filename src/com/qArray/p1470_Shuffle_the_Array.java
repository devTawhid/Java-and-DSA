package com.qArray;

import java.util.Arrays;

public class p1470_Shuffle_the_Array {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[count] = nums[i];
            count++;
            arr[count] = nums[i+n];
            count++;
        }
        return arr;
    }
}
