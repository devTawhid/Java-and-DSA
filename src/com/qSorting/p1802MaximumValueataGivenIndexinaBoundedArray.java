package com.qSorting;

public class p1802MaximumValueataGivenIndexinaBoundedArray {
    public static void main(String[] args) {
//        System.out.println(maxValue(6,1,10));
        System.out.println(test(6, 1, 4));
    }
    static int maxValue(int n, int index, int maxSum) {
        maxSum -= n;
        System.out.println(maxSum);
        int left = 0, right = maxSum, mid;
        while (left < right) {
            mid = (left + right + 1) / 2;
            if (test(n, index, mid) <= maxSum)
                left = mid;
            else
                right = mid - 1;
        }
        return left + 1;
    }

    static long test(int n, int index, int a) {
        int b = Math.max(a - index, 0);
        long res = (long)(a + b) * (a - b + 1) / 2;
        b = Math.max(a - ((n - 1) - index), 0);
        res += (long)(a + b) * (a - b + 1) / 2;
        return res - a;
    }
}
