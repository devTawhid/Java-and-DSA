package com.qBinarySearch;

import java.util.Arrays;

public class p167TwoSumIIInputarrayissorted {
    public static void main(String[] args) {
        int[] num = {3,24,50,79,88,150,345};
        int target = 200;
        System.out.println(Arrays.toString(twoSum(num, target)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while(start < end) {
            if(numbers[start] + numbers[end] < target) start++;
            if(numbers[start] + numbers[end] > target) end--;
            if(numbers[start] + numbers[end] == target) break;
        }
        return new int[]{start + 1, end + 1};
    }
}
