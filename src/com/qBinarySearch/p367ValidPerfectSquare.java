package com.qBinarySearch;

public class p367ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 16208676; // 4506
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {
        if(num == 0 || num == 2 || num == 3) return false;
        if(num == 1) return true;
        long start = 0;
        long end = num / 2;
        while(start <= end) {
            long mid = start + (end - start) / 2;
            if(mid * mid == num) return true;
            if(mid * mid < num) start = mid + 1;
            if(mid * mid > num) end = mid - 1;
        }
        return false;
    }
}
