package com.qBinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p349IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] nums2 = {4,9,5};
        int[] nums1 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));

    }

    static int[] intersection_(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        // finding the small array
        if(nums1.length > nums2.length) {
            int[] nums3 = nums1;
            nums1 = nums2;
            nums2 = nums3;
        }
        // sorting the array
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // binary searching
        for (int i = 0; i < nums1.length; i++) {
            int start = 0;
            int end = nums2.length;
            if(i != 0 && nums1[i] == nums1[i-1]) {
                continue;
            }
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if(nums1[i] == nums2[mid]) {
                    if(!res.contains(nums2[mid])) {
                        res.add(nums2[mid]);
                    }
                    break;
                }
                if(nums1[i] > nums2[mid]) {
                    start = mid + 1;
                }
                if(nums1[i] < nums2[mid]) {
                    end = mid - 1;
                }
                if(start >= nums2.length) {
                    break;
                }
            }
        }
        System.out.println(res.size());
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        System.out.println(Arrays.toString(result));
        return result;
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> val = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        if(nums1.length > nums2.length) {
            for (int i = 0; i < nums2.length; i++) {
                // TODO: 05-Feb-22 How to skip duplicate value in an array
                if(i == 0 || nums2[i] != nums2[i - 1]) {
                    int res = binarySearch(nums1,nums2[i]);
                    if(res != -1 && !val.contains(nums2[i]))
                        val.add(res);
                }
            }
        }else {
            for (int i = 0; i < nums1.length; i++) {
                if(i == 0 || nums1[i] != nums1[i - 1]) {
                    int res = binarySearch(nums2, nums1[i]);
                    if(res != 1 && !val.contains(res))
                        val.add(res);
                }
            }
        }
        int[] result = new int[val.size()];
        for (int i = 0; i < val.size(); i++) {
            result[i] = val.get(i);
        }

        return result;
    }

    // TODO: 05-Feb-22 work with the binary search part. There is some problem
    static int binarySearch(int[] nums1, int num) {
        int start = 0, end = nums1.length - 1;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if(num > nums1[mid])
                start = end + 1;
            if(num < nums1[mid])
                end = mid - 1;
            if(num == nums1[mid])
                return num;
        }
        return -1;
    }
}