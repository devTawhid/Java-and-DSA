package com.arrays.topics;

import java.util.Arrays;

public class Q1ArraySwap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param arr: the array the function will  run
     * @param index1: the 1st index of the element need to be swppped
     * @param index2: the 2nd index of the element need to be swppped
     * @return int
     */
    static int swap(int[] arr, int index1, int index2){
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return 0;
    }
}
