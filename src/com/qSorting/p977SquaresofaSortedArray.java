package com.qSorting;

import java.util.Arrays;

public class p977SquaresofaSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,2,3,10};
        System.out.println(Arrays.toString(sortedSquares_(nums)));
    }
    static int[] sortedSquares_(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        while (true) {
            if(k < 0)
                break;
            if(Math.pow(nums[i],2) > Math.pow(nums[j],2)) {
                res[k] = (int) Math.pow(nums[i],2);
                k--;
                i++;
            }
            else {
                res[k] = (int) Math.pow(nums[j],2);
                k--;
                j--;
            }
        }
        return res;
    }

    static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        // for (int j = 0; i < nums.length && j < nums.length; i = (int) Math.pow(-1,j + 1) * (j + 1) + i,j++) {
        //     res[j] = (int) Math.pow(nums[i], 2);
        // }

        int i = search(nums);
        int j = i - 1;
        int k = 0;
        int a = 0;
        int b = 0;
        while(k < nums.length) {
            if(i < nums.length)
                a = (int) Math.pow(nums[i], 2);
            if(j >= 0)
                b = (int) Math.pow(nums[j], 2);
            if(a < b && i < nums.length) {
                res[k] = a;
                i++;
                k++;
            }
            else if(a > b && j >= 0) {
                res[k] = b;
                j--;
                k++;
            }
            else if(i == nums.length - 1 && j > 0) {
                res[k] = b;
                j--;
                k++;
            }
            else if(j == 0 && i < nums.length - 1) {
                res[k] = a;
                i++;
                k++;
            }
        }
        return res;
    }

    static int search(int[] nums) {
        int start = 0, end = nums.length - 1;
        int i = 0;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] < 0 && nums[mid + 1] >= 0)
                return mid + 1;
            else if(nums[mid - 1] < 0 && nums[mid + 1] > 0)
                return mid;
            else if(nums[mid] >= nums[mid - 1])
                end = mid - 1;
            else if(nums[mid] <= nums[mid + 1])
                start = mid + 1;
        }
        return i;
    }
}
