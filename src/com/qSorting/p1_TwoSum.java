package com.qSorting;

import java.util.HashMap;

public class p1_TwoSum {
    public static void main(String[] args) {

    }
    static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap();
        map.put(nums[0],0);
        for(int i = 1; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
            } else {
                map.put(nums[i],i);
            }
        }
        return res;
    }
}
