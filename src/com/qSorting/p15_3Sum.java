package com.qSorting;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class p15_3Sum {
    public static void main(String[] args) {

    }
    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        HashMap<Integer, Integer> map = new HashMap();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i-1] == nums[i])
                continue;
            int start = i+1, end = nums.length - 1;

            while(start < end) {
                int threeSum = nums[i] + nums[start] + nums[end];
                if(threeSum < 0)
                    start++;
                else if(threeSum > 0)
                    end--;
                else {
                    res.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while(start < nums.length - 1 && nums[start] == nums[start+1])
                        start++;
                    while(end > 0 && nums[end-1] == nums[end])
                        end--;
                    start++;
                    end--;
                }
            }
        }
        return res;
    }
}
