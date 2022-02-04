package com.qBinarySearch;

import java.util.Arrays;

public class p1346CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {1,3,7};
        checkIfExist(arr);
    }

    static boolean checkIfExist(int[] arr) {
        // sorting
        Arrays.sort(arr);

        // searching
        for(int i = 0; i <= arr.length / 2; i++) {
            int start = i + 1;
            int end = arr.length;
            while(start <= end) {
                int mid = start + (end - start) / 2;
                if(arr[i] * 2 == arr[mid]) {
                    System.out.println("found");
                    return true;
                }
                if(arr[i] * 2 > arr[mid]) {
                    start = mid + 1;
                }
                if(arr[i] * 2 < arr[mid]) {
                    end = mid - 1;
                }
                if(start >= arr.length) {
                    break;
                }
            }
        }
        System.out.println("not found");
        return false;
    }
}
