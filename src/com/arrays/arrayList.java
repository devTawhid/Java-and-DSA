package com.arrays;

import java.util.*;

// ArrayList is a class which is a part of collection framework in java. It is like the std library in C++. It contains all
// the standard datastructures uses in competitive programming


public class arrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(); // inside <> we can't pass primitives. We have to pass
                                                     // "Wrapper classes" like for int it's Integer
//        list.add(45);
//        list.add(450);
//        list.add(4);
//        System.out.println(list.contains(450));
//
//        System.out.println(list);
//
//        list.set(0, 33);
//        System.out.println(list);
//
//        list.remove(2);
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            i = in.nextInt();
            list.add(i);
        }
        // to get an item
        System.out.println(list.get(2));
//        System.out.println(list);

    }
}
