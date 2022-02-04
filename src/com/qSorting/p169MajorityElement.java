package com.qSorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p169MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] res = sortArrayByParity(nums);
        System.out.println(Arrays.toString(res));
    }

    static int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length-1;
        for(int k = 0; k < nums.length; k++) {
            if(nums[k] % 2 == 0) {
                swap(nums, k, i);
                i++;
            }
        }
        return nums;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    // hashmap
    static int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if (!count.containsKey(nums[i])) {
                count.put(nums[i], 1);
            }
            else {
                count.put(nums[i], count.get(nums[i])+1);
            }
        }

        for (Integer key : count.keySet()) {
            if(count.get(key) > nums.length / 2)
                return key;
        }

        return -1;
    }

    // moore
    static int majorityElement_moore(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count == 0) {
                candidate = nums[i];
                count++;
            }
            else if(nums[i] == candidate) {
                count = count + 1;
            }
            else {
                count = count - 1;
            }
        }
        return candidate;
    }
}
