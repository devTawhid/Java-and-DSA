package com.qSorting;

import java.util.Arrays;

public class p455AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        findContentChildren(g,s);
    }
    static int findContentChildren(int[] g, int[] s) {
        int i = 0, j = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        if(s.length == 0) return 0;

        while(i < g.length && j < s.length) {
            if(g[i] <= s[j]) {
                i++;
                j++;
            }
            else if(g[i] > s[j])
                j++;
        }
        return i;
    }
}
