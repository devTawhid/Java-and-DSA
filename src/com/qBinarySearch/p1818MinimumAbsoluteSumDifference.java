package com.qBinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

//https://leetcode.com/problems/minimum-absolute-sum-difference/
public class p1818MinimumAbsoluteSumDifference {
    public static void main(String[] args) {
        int[] num1 = {1,10,4,4,2,7};
        int[] num2 = {9,3,5,1,7,4};
        int sum = minAbsoluteSumDiff(num1, num2);
//        System.out.println(sum);
    }

    static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums1.length; i++) {
            sum += Math.abs(nums1[i] - nums2[i]);
        }
        Arrays.sort(nums1);
        int res = 0;
        for (int i = 0; i < nums1.length; i++) {
            int oldDiff = Math.abs(nums1[i] - nums2[i]);
            int newDiff = Math.abs(lowerBound(nums1,nums2[i]) - nums2[i]);
            res = Math.max(Math.abs(oldDiff - newDiff), res);
        }

        System.out.println(sum - res);
        return min;
    }
    static int lowerBound(int[] num1, int val) {
        int start = 0,end = num1.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if(start + 1 == end) break;
            if(num1[mid] == val) {
                start = mid;
                end = mid + 1;
                break;
            }
            else if(num1[mid] < val)
                start = mid;
            else if(num1[mid] > val)
                end = mid;
        }
        return Math.abs(val - num1[start]) < Math.abs(val - num1[end]) ? num1[start]: num1[end];
    }
}
//https://codeshare.io/eV89kJ