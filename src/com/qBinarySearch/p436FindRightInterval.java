package com.qBinarySearch;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeMap;

public class p436FindRightInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,12},{2,9},{3,10},{13,14},{15,16},{16,17}};
        int[] result = findRightInterval2(intervals);
        System.out.println(Arrays.toString(result));
    }

    /**
     * O(n*n) solution + O(1) space
     * link: https://leetcode.com/problems/find-right-interval/
     * @param intervals array
     * @return a matix
     */
    static int[] findRightInterval(int[][] intervals) {
        int[] result = new int[intervals.length];

        Arrays.fill(result, -1);
        for (int i = 0; i < result.length; i++) {
            int num = Integer.MAX_VALUE;
            for(int j = 0; j < result.length; j++) {
                if(intervals[i][1] == intervals[j][0]) {
                    result[i] = j;
                    break;
                } else if (intervals[i][1] < intervals[j][0] && num > intervals[j][0]) {
                    num = intervals[j][0];
                    result[i] = j;
                }
            }
        }
        return result;
    }

    /**
     * O(nlog(n)) solution + O(n) space
     * @param intervals
     * @return
     */
    static int[] findRightInterval2(int[][] intervals) {
        int[] result = new int[intervals.length];
        TreeMap<Integer, Integer> first = new TreeMap<>();

        Arrays.fill(result,-1);
        for(int i = 0; i < result.length; i++) {
            first.put(intervals[i][0], i);
        }

        for(int i = 0; i < first.size(); i++) {
            if(first.ceilingKey(intervals[i][1]) != null) {
                result[i] = first.get(first.ceilingKey(intervals[i][1]));
            }
            else result[i] = -1;
            ;
        }
        return result;
    }

    static int[] findRightInterval3(int[][] intervals) {
        int[] result = new int[intervals.length];
        int[] first = new int[intervals.length];
        TreeMap<Integer, Integer> firstWithValue = new TreeMap<>();

        int num = (first[1] == 3) ? 0 : 1;
        System.out.println(first[1]);
        return new int[]{};
    }
}
