package com.qArray;

public class p1672_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int max = maximumWealth(accounts);
        System.out.println(max);
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(sum, max);
            sum = 0;
        }
        return max;
    }
}
