package com.qString;

import java.util.Arrays;

public class p1528ShuffleString {
    public static void main(String[] args) {
        int[] indecis = {3,1,4,2,0};
        System.out.println(restoreString("aiohn", indecis));
        //"nihao"
    }
    static String restoreString(String s, int[] indices) {
        char[] str = s.toCharArray();

        int i = 0;
        while (i < indices.length) {
            if(i != indices[i]) {
                swap(str, i, indices[i]);
                swapI(indices,i,indices[i]);
            }else
                i++;
        }
        System.out.println(Arrays.toString(indices));
        return new String(str);
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void swapI(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
