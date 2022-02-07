package com.qString;

public class p125ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(".,"));
    }
//  Character.isLetterOrDigit(s.charAt(right))
    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) i--;
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}
