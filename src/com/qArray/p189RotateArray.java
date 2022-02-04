package com.qArray;

import java.util.Arrays;

public class p189RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 2;
//        rotate(nums, k);
//        rotate2(nums, k);
//        rotate3(nums, k);
        rotate4(nums, k);
        System.out.println(Arrays.toString(nums));

    }

    /**
     * recursive solution
     * @param nums: the array in question
     * @param k: num of times to call rotate function recursively
     */
    static void rotate(int[] nums, int k) {
        if(k == 0) return;
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            int temp2 = nums[i];
            nums[i] = temp;
            temp = temp2;
        }
        k--;
        System.out.println(Arrays.toString(nums));
        rotate(nums,k);
    }

    /**
     * using an extra array of size k
     * @param nums:the array in question
     * @param k: size of the extra array
     */
    static void rotate2(int[] nums, int k) {
        if(k > nums.length) k = k % nums.length;
        int[] arrK = new int[k];

        for (int i = 0; i < k; i++) {
            arrK[arrK.length - i - 1] = nums[nums.length - i - 1];
        }
        int j = 0;
        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[nums.length - j - 1] = nums[i];
            j++;
        }
        for (int i = 0; i < k; i++) {
            nums[i] = arrK[i];
        }
//        System.out.println(Arrays.toString(nums));
    }

    /**
     * reversing solution!!! Just awesome
     * @param nums: the array in question
     * @param k: rotation time
     */
    static void rotate3(int[] nums, int k) {
        if(k > nums.length) k = k % nums.length;
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
        for (int i = 0; i < k / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[k - i - 1];
            nums[k - i - 1] = temp;
        }
        int j = 0;
        for (int i = k; i < (nums.length + k) / 2 ; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - j - 1];
            nums[nums.length - j - 1] = temp;
            j++;
        }
        System.out.println(Arrays.toString(nums));
    }

    /**
     * the fastest
     * @param nums: the array in question
     * @param k: rotation time
     */
    static void rotate4(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length -1);
        reverse(nums, 0, k - 1);
        reverse(nums, k - 0, nums.length -1);
    }
    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
