package com.qArray;

import java.util.Arrays;

public class p42TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {1,0,1,2,1,0,2};
        trapBf(height);
    }
    static int trapBf(int[] height) {
        int result = 0;
        int[] leftMax = new int[height.length];
        int[] righttMax = new int[height.length];
        int maxVal = 0;
        for (int i = 0; i < height.length; i++) {
            maxVal = Math.max(maxVal, height[i]);
            leftMax[i] = maxVal;
        }
        maxVal = 0;
        for (int i = height.length - 1; i >= 0 ; i--) {
            maxVal = Math.max(maxVal, height[i]);
            righttMax[i] = maxVal;
        }

        for (int i = 0; i < height.length; i++) {
            result += Math.min(leftMax[i], righttMax[i]) - height[i];
        }
        return result;
    }
}
