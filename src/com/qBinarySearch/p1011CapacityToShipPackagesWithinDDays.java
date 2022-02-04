package com.qBinarySearch;

public class p1011CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 1;
        System.out.println(shipWithinDays(weights, days));
    }
    static int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;
        for(int i = 0; i < weights.length; i++) {
            start = Math.max(start, weights[i]);
            end += weights[i];
        }
        int ans = end;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isPossible(weights, days, mid)) {
                ans = Math.min(ans, mid);
                end = mid;
            }
            else
                start = mid + 1;
        }

        return ans;
    }

    static boolean isPossible(int[] weights, int days, int mid) {
        int load = 0;
        int d = 1; // ??????
        for (int i = 0; i < weights.length; i++) {
            load += weights[i];
            if (load > mid) {
                d++;
                load = weights[i];
            }
        }
        return d <= days;
    }

}
