package com.arrays;

import java.util.Arrays;

public class arrayFunction {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        // Strings are immutable in java
        // but arrays are mutable in java
    }

    static void change(int[] arr){
        System.out.println(Arrays.toString(arr));
        arr[0] = 15666;
        System.out.println(Arrays.toString(arr));
    }
}
