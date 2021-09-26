package com.questions;

import java.util.Arrays;

public class p1304_Find_N_Unique_Integers_Sum_up_to_Zero {
    public static void main(String[] args) {
        sumZero(4);
    }
    static int[] sumZero(int n) {
        int[] arr= new int[n];
        int start = (int) -Math.floor(arr.length / 2);

        for (int i = 0; i < arr.length; i++) {
            if(arr.length % 2 != 0) {
                arr[i] = start + i;
            }else {
                if(start + i == 0){
                    start = start + 1;
                    arr[i] = start + i;
                } else {
                    arr[i] = start + i;
                }
            }
        }

        return arr;
    }
}
