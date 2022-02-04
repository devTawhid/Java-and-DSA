package com.qArray;

public class p55JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
    }

    static boolean canJump(int[] nums) {
        int lastGoodPosition = nums.length - 1;

        for(int i = nums.length - 1; i >= 0; i--){
            if(i + nums[i] >= lastGoodPosition) lastGoodPosition = i;
        }
        return lastGoodPosition == 0;
    }
}
