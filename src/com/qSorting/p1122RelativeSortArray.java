package com.qSorting;

import java.util.Arrays;
import java.util.TreeMap;

public class p1122RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31}, arr2 = {2,42,38,0,43,21};
        relativeSortArray(arr1,arr2);
    }
    static int[] relativeSortArray(int[] arr1, int[] arr2) {
//        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        TreeMap<Integer, Integer> map2 = new TreeMap<Integer, Integer>();
//        for (Integer nums: arr1) {
//            if(map.get(nums) == null)
//                map.put(nums, 1);
//            else
//                map.put(nums, map.get(nums)+1);
//        }
        for (int nums:arr1) {
            map2.put(nums, map2.getOrDefault(nums, 0) + 1);
        }
//        System.out.println(map);
//        System.out.println(map2);
        int index  = 0;
        for (int nums:arr2) {
            int count =  map2.get(nums);
            while (count-- > 0)
                arr1[index++] = nums;
            map2.remove(nums);
        }

        for (int key: map2.keySet()) {
            int value = map2.get(key);
            while (value-- > 0 )
                arr1[index++] = key;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(map2);

        return arr1;
    }
}
