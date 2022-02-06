package com.qSorting;

import java.util.Arrays;

public class p1051HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }

    static int heightChecker(int[] heights) {
        int[] heightToFreq = new int[11];
        int[] checker = new int[heights.length];
        int counter = 0;

        for (int height : heights) {
            heightToFreq[height]++;
        }
        System.out.println(Arrays.toString(heightToFreq));

        int result = 0;
        int curHeight = 0;

        for (int i = 0; i < heights.length; i++) {
            while (heightToFreq[curHeight] == 0) {
                curHeight++;
            }

            if (curHeight != heights[i]) {
                result++;
            }
            heightToFreq[curHeight]--;
        }
        return result;
    }
}
