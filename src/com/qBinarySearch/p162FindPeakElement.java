package com.qBinarySearch;

public class p162FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int res = findPeakElement(nums);
        System.out.println(res);
    }
    static int findPeakElement(int[] nums) {
        int s = 0, e = nums.length-1;
        while (s < e) {
            int m = (s+e) >> 1;
            if(nums[m] < nums[m+1])
                s = m+1;
            else
                e = m;
        }
        return e;
    }
}
