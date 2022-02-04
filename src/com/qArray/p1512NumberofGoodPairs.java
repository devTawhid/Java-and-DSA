package com.qArray;

public class p1512NumberofGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }
    static int numIdenticalPairs(int[] nums) {
        int good = 0;
        int[] freq = new int[101];

        for(int i = 0; i < nums.length; i++){
            if(freq[nums[i]] == 0){
                freq[nums[i]] = 1;
            }
            else{
                freq[nums[i]] ++;
            }
        }//for

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] > 1){
                good += freq[i] * (freq[i] - 1) / 2;
            }
        }

        return good;
    }
}
