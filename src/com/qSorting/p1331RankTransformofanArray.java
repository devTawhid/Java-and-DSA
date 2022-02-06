package com.qSorting;

import java.util.Arrays;
import java.util.TreeMap;

public class p1331RankTransformofanArray {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        arrayRankTransform(arr);
    }
    static int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] res = new int[arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        System.out.println(map);

        for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(arr2[i]);
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}