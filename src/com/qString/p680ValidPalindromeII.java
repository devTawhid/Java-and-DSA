package com.qString;

public class p680ValidPalindromeII {
    public static void main(String[] args) {
        System.out.println(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
    static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        int count = 0;
        while (i < j) {
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(a == b){
                i++;
                j--;
            }else if(a != b){
                int c = s.charAt(i+1);
                int d = s.charAt(j-1);
                if(c == b) {
                    count++;
                    i++;
                }else if(a == d){
                    count++;
                    j--;
                }else return false;
            }
        }
        System.out.println(count);
        return count < 2;
    }

    static boolean validPalindrome_lee215(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--)
            if (s.charAt(i) != s.charAt(j)) {
                int i1 = i;
                int j1 = j - 1;
                int i2 = i + 1;
                int j2 = j;

                while (i1 < j1 && s.charAt(i1) == s.charAt(j1)) {i1++; j1--;};
                while (i2 < j2 && s.charAt(i2) == s.charAt(j2)) {i2++; j2--;};
                return i1 >= j1 || i2 >= j2;
            }
        return true;
    }
}
