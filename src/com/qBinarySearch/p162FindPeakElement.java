package com.qBinarySearch;

public class p162FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int res = findPeakElement(nums);
        System.out.println(res);
    }
    static int findPeakElement(int[] nums) {
        // edge cases
        if(nums.length == 1)
            return 0;
        if(nums[0] > nums[1])
            return 0;
        if(nums[nums.length - 1] > nums[nums.length - 2])
            return nums.length - 1;

        //binary search
        int start = 0;
        int end = nums.length - 1; //here was the issue
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid != 0 && mid != nums.length - 1)
                if ( nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1] )
                    return mid;
            else if(nums[mid] < nums[mid + 1])
                start = mid;
            else if(nums[mid] < nums[mid - 1])
                end = mid;
        }
        return 0;
    }
}
