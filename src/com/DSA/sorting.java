package com.DSA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sorting {
    public static void main(String[] args) {
//        int[] arr = {0,1,4,7,8,9,8,5,6,5,0,2,5,8,7,9}; //cyclic sort
//        int[] arr = {5,2,1,0,3};                       //missing value
//        int[] arr = {6,8,2,1,5,4,4,6};                 //disappeared values
//        int[] arr = {3,5,2,1,4,3};                     //duplicate value
//        int[] arr = {6,5,4,7,5,3,4,1,2};               //All duplicate value
//        int[] arr = {3,5,2,1,3};                       //misMatch
//        int[] arr = {3,2,5,1,-1};                       //find missing positive
        int[] arr = {6,5,4,8,4,5,3,4,-5,-4};
        System.out.println(Arrays.toString(coutingSort_(arr)));
    }

    //cyclic sort
    // when given numbers from range 1 to n => use cyclic sort
    static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] == i + 1) // here is a issue index == value - 1
                i++;
            else
                swap(arr, i, arr[i] - 1);
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

    static int[] countingSort(int[] arr) {
        int[] temp = new int[10];
        int[] arr2 = new int[arr.length];

        //creating the counter
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }

        //making the counter to a indexed version
        for (int i = 1; i < temp.length; i++) {
            temp[i] = temp[i] + temp[i - 1];
        }

        //putting the value in a separate array
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[arr[i]]--;
            arr2[temp[arr[i]]] = arr[i];
        }

        return arr2;
    }

    //practice #1 counting sort supports negative values
    static int[] coutingSort_(int[] arr) {
        int maxVal = arr[0];
        int minVal = arr[0];
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            maxVal = Math.max(maxVal, arr[i]);
            minVal = Math.min(minVal, arr[i]);
        }

        int[] temp = new int[maxVal - minVal + 1];

        for (int i = 0; i < arr.length; i++) {
            temp[arr[i] - minVal]++;
        }

        for (int i = 1; i < temp.length; i++) {
            temp[i] += temp[i - 1];
        }
        System.out.println(Arrays.toString(temp));
        for (int i = arr.length - 1; i >= 0;  i--) {
            temp[arr[i] - minVal]--;
            arr2[temp[arr[i] - minVal]] = arr[i] ;
        }

        return arr2;
    }



    //practice #1 cyclic sort
    static int[] cyclicSort_(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1])  // arr[arr[i] - 1]/ i + 1 // index = value - 1
                                            // here numbers will be 1 -> n
                swap(arr, i, arr[i] - 1);
            else
                i++;
        }
        return arr;
    }

    //practice #1st problem cyclic sort
    static int MissingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i] != arr.length)        // this part is for the last number
                if (arr[i] != arr[arr[i]])  // here numbers will be 0 -> n
                    swap(arr, i, arr[i]);
                else
                    i++;
            else
                i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j)
                return j;
        }

        return arr.length - 1;
    }

    //practice #2nd problem cyclic sort
    static List<Integer> disappeared(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if(arr[i] != arr[arr[i] - 1])
                swap(arr, i, arr[i] - 1);
            else
                i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1)
                res.add(j + 1);
        }
        return res;
    }

    //practice #3rd problem cyclic sort
    static int duplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i] != arr[arr[i] - 1])
                swap(arr, i, arr[i] - 1);
            else
                i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1)
                return arr[j]; // -> change in here
        }
        return arr.length + 1;
    }

    //practice #4th problem cyclic sort
    static List<Integer> allDuplicate(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if(arr[i] != arr[arr[i] - 1])
                swap(arr, i, arr[i] - 1);
            else
                i++;
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1)
                res.add(arr[j]);  // -> change is here
        }
        return res;
    }

    //practice #5th problem cyclic sort
    static int mismatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i] != arr[arr[i] - 1])
                swap(arr, i, arr[i] - 1);
            else
                i++;
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1)
                return j + 1;
        }
        return 0;
    }

    //practice #6th problem cyclic sort
    static int firstMissingPos(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i] > 0)
                if(arr[i] < arr[arr[i] - 1])
                    swap(arr, i, arr[i] - 1);
                else
                    i++;
            else
                i++;
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1)
                return j + 1;
        }
        return 0;
    }
}
