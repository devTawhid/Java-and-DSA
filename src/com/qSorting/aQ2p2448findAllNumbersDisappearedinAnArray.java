package com.qSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class aQ2p2448findAllNumbersDisappearedinAnArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,7,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
        System.out.println(Arrays.toString(nums));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if(nums[i] == nums[nums[i] - 1]) //arr[i] == i + 1 // why can't we use this instead???
                i++;
            else
                swap(nums, i, nums[i] - 1);
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1)
                result.add(j + 1);
        }
        return result;
    }
    static void swap(int[] arr, int i, int j) {
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }
}
