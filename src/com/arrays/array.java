package com.arrays;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        // no 1 way
        int[] arr = new int[5];
//        it can also be like this
        int arr2[] = new int[6]; // just like c
        // if we initialize the array like the above then the resulting array will be [0, 0, 0, 0, 0] size mentioned
//        System.out.println(Arrays.toString(arr));
        // no 2 way
        int[] roll = {12 , 13, 45, 115, 15};
//        System.out.println(roll);
//        System.out.println(Arrays.toString(roll));

        // declaration happening in the stack memory here
        int[] ros;
        // initialization in the heap memory
        ros = new int[5]; // size is a must. dynamic memory allocation here, which is done at runtime.

        String[] str = new String[5]; // for string it will be [null, null, null, null, null]
        System.out.println(Arrays.toString(str));

//        int num = null;// we can't assign to any primitives
        String a = null;// here we can do that. Since it's not primitive. Object value which assign  to any reference data type
                        // it's special value. And it's by default data in any reference datatype
                        // null is kind of undefined in javascript


    }
}
