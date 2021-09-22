package com.DSA;

import java.util.Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50};
        int val = 14;

        String str = "Tawhid";
        char target = 'd';
        boolean res = linearOnString(str, target);
        System.out.println(res);
        System.out.println(Arrays.toString(str.toCharArray()));
    }

    /**
     *
     * @param arr: the array we like to search
     * @param val: the value we like to search
     * @return if found then returns the index else return -1;
     */
    static int linear(int[] arr, int val){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == val) return i;
        }
        return -1;
    }

    /**
     *
     * @param str: the string need to be searched
     * @param target: the char we will search
     * @return true if found else false also false if the string size is 0
     */
    static boolean linearOnString(String str, char target){
        if(str.length() == 0) return false;

        for (char ch : str.toCharArray()) {
            if(ch == target) return true;
        }
        return false;
    }
}
