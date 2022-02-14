package com.qSorting;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class p18_4Sum {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }

    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i<nums.length; i++) {
            if(i>0 && nums[i-1] == nums[i])
                continue;
            for(int j = i+1; j<nums.length; j++) {
                if(j>0 && nums[j-1] == nums[j])
                    continue;

                int s = j+1, e = nums.length-1;
                while(s < e) {
                    int sum = nums[i]+nums[j]+nums[s]+nums[e];
                    if(sum < target)
                        s++;
                    else if(sum > target)
                        e--;
                    else{
                        res.add(Arrays.asList(nums[i],nums[j],nums[s],nums[e]));
                        while(s < nums.length-1 && nums[s] == nums[s+1])
                            s++;
                        while(e > 0 && nums[e] == nums[e-1])
                            e--;
                        s++;
                        e--;
                    }
                }
            }
        }
        return res;
    }
}
