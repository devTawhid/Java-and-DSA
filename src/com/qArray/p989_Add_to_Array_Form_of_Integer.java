package com.qArray;

import java.util.ArrayList;
import java.util.List;

public class p989_Add_to_Array_Form_of_Integer {
    public static void main(String[] args) {
        int[] num = {0,0,1,0};
        int k = 34;
        System.out.println(addToArrayForm(num, k));
    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int sum = k;
        for (int i = 0; i < num.length; i++) {
            sum += num[i] * (int)Math.pow((double) 10, (double)  (num.length - 1 - i));
        }
        System.out.println(sum);
        int size = (int)Math.log10(sum) + 1;
        for (int i = 0; i < size; ++i) {
            int factor = (int)Math.pow((double) 10, (double)  (num.length - 1 - i));
            int preElem = (int)(sum % factor);
            int elem = (sum - preElem) / factor;
            sum = preElem;
            result.add(elem);
        }
        return result;
    }
}
