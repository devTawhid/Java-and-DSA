package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayListMultidimentional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

//        System.out.println(Arrays.toString(list));
        System.out.println(list);
    }
}
