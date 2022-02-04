package com.qBinarySearch;

public class p69SqrtX {
    public static void main(String[] args) {
        System.out.println(mySqrt(3));
    }
    static int mySqrt(int x) {
        if(x==0) return 0;
        if(x==1 || x == 2) return 1;

        int ans = 0;
        int start = 1;
        int end = x / 2;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(mid*mid == x) return mid;
            if(mid <= x/mid) {
                start = mid + 1;
                ans = mid;
            }
            if(mid >= x/mid) end = mid - 1;
        }
        return ans;
    }
}