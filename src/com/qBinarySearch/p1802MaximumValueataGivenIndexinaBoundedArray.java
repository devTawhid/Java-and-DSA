package com.qBinarySearch;

//https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/
public class p1802MaximumValueataGivenIndexinaBoundedArray {
    public static void main(String[] args) {
        int result = maxValue(3, 0, 815094800);
        System.out.println(result);
    }

    /**
     *
     * @param n
     * @param index
     * @param maxSum
     * @return
     */
    static int maxValue(int n, int index, int maxSum) {
        int r = n - index - 1;
        int l = index;
        int start = 1;
        int end = maxSum;
        int result = 0;

        while (start <= end) {
            int rs = 0;
            int ls = 0;
            int mid = start + (end - start) / 2;
            int sum = mid;
            int m = mid - 1;

            if(r <= m)
                rs = m * (m + 1) / 2 - (m - r) * (m - r + 1) / 2;
            else
                rs = m * (m + 1) / 2 + (r - m);

            if(l <= m)
                ls = m * (m + 1) / 2 - (m - l) * (m - l + 1) / 2;
            else
                ls = m * (m + 1) / 2 + (l - m);

            sum += rs + ls;

            if(sum <= maxSum) {
                result = mid;
                start = mid + 1;
            }else
                end = mid - 1;

        }
        return result;
    }
}
