package com.qSorting;

import java.util.Arrays;

public class p16_3SumClosest {
    public static void main(String[] args) {
        int[] nums = {1,1,-1,-1,3};
        System.out.println(threeSumClosest(nums, -1));
    }
    static int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int newSum = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int start = i+1, end = nums.length-1;
            while (start < end) {
                int sum = nums[i]+nums[start]+nums[end];
                if(Math.abs(target-sum) < diff)
                    newSum = sum;
                diff = Math.min(diff, Math.abs(target-sum));
                if(target > sum)
                    start++;
                else if(target < sum)
                    end--;
                else
                    return sum;
            }
        }
        return newSum;
    }
}
