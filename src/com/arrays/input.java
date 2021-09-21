package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
//        System.out.println(Arrays.toString(arr));

        for(int num:arr){ // 2: just like for of loop in javascript
                          // so num represents as elements
            System.out.print(num + " ");
        }

        // 3: easy way to print an array
        System.out.println(Arrays.toString(arr));
    }
}
