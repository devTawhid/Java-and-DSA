package com.DSA;

public class recusion {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,8,9};
        // recording the current time
        long start = System.nanoTime();

        // code is running here;
        binarySearch(nums,8,0,nums.length-1);


        // calculating the time elapsed
        long end = System.nanoTime() - start;
        int seconds = (int) (end / 1000000000);
        int milliseconds = (int) (end / 1000000) % 1000;
        int nanoseconds = (int) (end % 1000000);
        System.out.printf("%ds %dms %dns \n", seconds, milliseconds, nanoseconds);
        System.out.println(binarySearch(nums,8,0,nums.length-1));
    }
    static int fibo(int val) {
        if(val < 2)
            return 1;
        return fibo(val-1) + fibo(val-2);
    }

    static int fact(int val) {
        if(val <= 2)
            return val;
        return val * fact(val-1);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        if(start > end)
            return -1;
        int mid = (start + end) >> 1;
        if(target > nums[mid])
            return binarySearch(nums, target, mid+1, end);
        else if(target < nums[mid])
            return binarySearch(nums, target, start, mid-1);
        return mid;
    }
}
