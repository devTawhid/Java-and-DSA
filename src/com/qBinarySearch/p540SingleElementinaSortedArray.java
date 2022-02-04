package com.qBinarySearch;

public class p540SingleElementinaSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4,8};
        int res = singleNonDuplicate(nums);
        System.out.println(res);
    }
    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length;
        if(nums.length == 1) return nums[0];
        if(nums.length != 1 && nums[start] != nums[start + 1]) return nums[start];
        if(nums[end - 1] != nums[end - 2]) return nums[end - 1];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            if((mid % 2 != 0 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                start = mid + 1;
            }
            if((mid % 2 != 0 && nums[mid] != nums[mid - 1]) || (mid % 2 == 0 && nums[mid] != nums[mid + 1])) {
                end = mid - 1;
            }
        }
        return 0;
    }
}
