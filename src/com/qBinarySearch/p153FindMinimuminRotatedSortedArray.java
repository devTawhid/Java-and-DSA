package com.qBinarySearch;

public class p153FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,1};
        int result = findMin(nums);
        System.out.println(result);
    }

    /**
     * finds the pivot
     * @param nums
     * @return the index of the pivot
     */
    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if(start == end) return nums[start];
        if(nums.length == 2) {
            if(nums[0] == nums[1]) return nums[0];
            if(nums[0] > nums[1]) return nums[1];
            if(nums[0] < nums[1]) return nums[0];
        }
        if(nums[start] < nums[end]) return nums[start];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (start < end && nums[mid] > nums[mid + 1]) return nums[mid + 1];
            else if (start < end && nums[mid - 1] > nums[mid]) return nums[mid];

//            if(nums[mid] <= nums[end]) end = mid - 1;
//            if(nums[mid] >= nums[start]) start = mid + 1;
            else if (nums[start] == nums[end]){
                if(nums[mid] > nums[mid + 1]){
                    return nums[mid + 1];
                }
                start++;
                if(nums[mid] < nums[mid - 1]){
                    return nums[mid];
                }
                end--;
            }
        }
        return -1;
    }
}


