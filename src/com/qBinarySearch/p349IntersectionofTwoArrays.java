package com.qBinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class p349IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] nums2 = {4,5,4};
        int[] nums1 = {2,4,5,4};
        intersection(nums1,nums2);

    }

    static int[] intersection(int[] nums1, int[] nums2) {
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
}
