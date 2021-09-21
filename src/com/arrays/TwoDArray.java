package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][4]; // here adding the rows is mandatory. I mean we must have to fill the first square bracket.
//        System.out.println(Arrays.toString(arr)); it is not working

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col <arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

    }
}
