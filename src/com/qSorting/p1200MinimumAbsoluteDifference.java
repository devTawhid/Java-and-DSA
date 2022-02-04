package com.qSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class p1200MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(minimumAbsDifferenceCounting(arr));
    }
    static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            minDiff = Math.min(minDiff, diff);
        }

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - arr[i - 1] == minDiff)
                res.add(Arrays.asList(arr[i - 1], arr[i]));
        }

        return res;
    }

    static List<List<Integer>> minimumAbsDifferenceCounting(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int maxVal = arr[0];
        int minVal = arr[0];

        for (int i = 0; i < arr.length; i++) {
            maxVal = Math.max(arr[i], maxVal);
            minVal = Math.min(arr[i], minVal);
        }

        int[] line = new int[maxVal - minVal + 1];
        for (int i = 0; i < arr.length; i++) {
            line[arr[i] - minVal]++;               // faced a lot of issue here
        }

//        System.out.println(Arrays.toString(line));
        int prev = minVal;
        int diff = Integer.MAX_VALUE;
        for (int cur = 0; cur < line.length; cur++) {
            int val = cur + minVal;
            if(val - prev == 0)
                prev = val;
            else if(line[cur] == 1) {
                if(val - prev < diff) {
                    res = new ArrayList<>();
                    res.add(Arrays.asList(prev, val));
                }
                else if(val - prev == diff)
                    res.add(Arrays.asList(prev, val));
                diff = Math.min(val - prev, diff);
                prev = val;
            }
        }
        return res;
    }
}
