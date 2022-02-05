package com.qSorting;

import java.util.Arrays;
import java.util.TreeMap;

// TODO: 05-Feb-22 => think about ++i and i++ here
//                 => if you have forgotten then search for the term "++i and i++"
public class p1122RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {3,2,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }
    static int[] relativeSortArray_(int[] arr1, int[] arr2) {
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

    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int num : arr1)
            map.put(num, map.getOrDefault(num,0) + 1);

        System.out.println(map);
        int index = 0;
        for (int num : arr2) {
            int value = map.get(num);
            while (value-- > 0)
                arr1[index++] = num;
            map.remove(num);
        }

        for (int num :map.descendingKeySet()) {
            int value = map.get(num);
            while (value-- > 0) {
                arr1[index++] = num;
            }
        }

        return arr1;
    }
}