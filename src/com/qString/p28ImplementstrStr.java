/**
 * @author: Tawhid
 * @date: 06:02:22
 * kmp search
 * Time complexity: O(m + n) m -> the string where we are searching
 *                           n -> the pattern we are searching
 *
 */
// TODO: 06-Feb-22 => KMP substring search.
package com.qString;

import java.lang.reflect.Array;
import java.util.Arrays;

public class p28ImplementstrStr {
    public static void main(String[] args) {
        // recording the current time
        long start = System.nanoTime();

        // code is running here;
        strStr("aaaaa", "aa");

        // calculating the time elapsed
        long end = System.nanoTime() - start;
        int seconds = (int) (end / 1000000000);
        int milliseconds = (int) (end / 1000000) % 1000;
        int nanoseconds = (int) (end % 1000000);
        System.out.printf("%ds %dms %dns \n", seconds, milliseconds, nanoseconds);

        System.out.println(strStr("hello", "ll"));
//        System.out.println(strStr("aaaaa", "aabaabaaa"));
    }

    static int[] computeTemporaryArray(String needle) {
        // creating the array to track the prefix array
        int[] temp = new int[needle.length()];
        int i = 1;
        int j = 0;
        while (i < temp.length && j < temp.length) {
            if(needle.charAt(i) == needle.charAt(j)) {
                temp[i] = j + 1;
                i++;
                j++;
            } else {
                if(j != 0)
                    j = temp[j - 1];
                else {
                    temp[j] = 0;
                    i++;
                }
            }
        }
        return temp;
    }

    static int strStr(String heystack, String needle) {
        if(heystack.length() == 0 && needle.length() == 0)
            return 0;
        // doing the actual searching here
        int[] temp = computeTemporaryArray(needle);
        int i = 0;
        int j = 0;
        while (i < heystack.length() && j < needle.length()) {
            if(j == needle.length() - 1) {
                return i - j;
            }
            else if(heystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else {
                if(j != 0)
                    j = temp[j - 1];
                else {
                    i++;
                }
            }
        }

        return -1;
    }
    static int strStrr(String heystack, String needle) {
        int ans = -1, j = 0;
        for(int i = 0; i < heystack.length(); i++) {
            if(j < needle.length()) {
                if(heystack.charAt(i) == needle.charAt(j)){
                    j++;
                    ans = i;
                }else if(j > 0 && heystack.charAt(i) != needle.charAt(j))
                    return -1;
                else
                    return -1;
            }
        }
        return ans - needle.length() + 1;
    }
}
