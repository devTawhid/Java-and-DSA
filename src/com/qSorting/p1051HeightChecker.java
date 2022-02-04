package com.qSorting;

public class p1051HeightChecker {
    public static void main(String[] args) {
        int[] heights = {5,1,2,3,4};
        heightChecker(heights);
    }

    static int heightChecker(int[] heights) {
        int[] heightToFreq = new int[101];
        int[] checker = new int[heights.length];
        int counter = 0;

        for (int i = 0; i < heights.length; i++) {
            heightToFreq[heights[i]]++;
        }

        for (int i = heights.length - 1; i >= 0 ; i++) {
            while (heightToFreq[i] > 0)
                heightToFreq[i]--;
        }
        return counter;
    }
}
