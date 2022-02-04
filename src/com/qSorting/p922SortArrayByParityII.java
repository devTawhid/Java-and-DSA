package com.qSorting;

public class p922SortArrayByParityII {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        sortArrayByParityII(nums);
    }
    static int[] sortArrayByParityII(int[] nums) {
        int i = 0, j = 1;
        while(i < nums.length && j < nums.length) {
            if(nums[i] % 2 == 0 && nums[j] % 2 != 0) {
                i = i + 2;
                j = j + 2;
            }
            else if(nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                swap(nums, i, j);
                i = i + 2;
                j = j + 2;
            }
            else if(nums[i] % 2 == 0 && nums[j] % 2 == 0)
                i = i + 2;
            else if(nums[i] % 2 != 0 && nums[j] % 2 != 0)
                j = j + 2;
        }
        return nums;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
