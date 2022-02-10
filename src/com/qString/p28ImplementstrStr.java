/**
 * @author: Tawhid
 * @date: 06:02:22
 * kmp search
 * Time complexity: O(m + n) m -> the string where we are searching
 *                           n -> the pattern we are searching
 *
 * practice #1: 07-02-22
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
        strStr__("abaxabaayabaababaabce", "abaabc");

        // calculating the time elapsed
        long end = System.nanoTime() - start;
        int seconds = (int) (end / 1000000000);
        int milliseconds = (int) (end / 1000000) % 1000;
        int nanoseconds = (int) (end % 1000000);
        System.out.printf("%ds %dms %dns \n", seconds, milliseconds, nanoseconds);

        System.out.println(strStr__("abaxabaayabaababaabce", "abaabc"));
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

    // practice #1
    static int[] computeTemporaryArray_(String pattern) {
        int[] temp = new int[pattern.length()];
        int i = 1, j = 0;
        while (i < pattern.length() && j < pattern.length()) {
            if(pattern.charAt(i) == pattern.charAt(j)) {
                temp[i] = j + 1;
                i++;
                j++;
            } else {
                if(j != 0) {
                    j = temp[j - 1];
                } else {
                    temp[i] = 0;
                    i++;
                }
            }
        }

        return temp;
    }
    static int strStr_(String word, String pattern) {
        int i = 0, j = 0;
        int[] temp = computeTemporaryArray_(pattern);
        while (i < word.length() && j < pattern.length()) {
            if(j == pattern.length() - 1) {
                return i - j;
            }else if(word.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }else {
                if(j != 0)
                    j = temp[j - 1];
                else
                    i++;
            }
        }
        return -1;
    }

    // practice #2
    static int[] computeTemporaryArray__(String pattern) {
        int[] arr = new int[pattern.length()];
        int i = 1, j = 0;
        while (i < pattern.length()) {
            if(arr[i] == arr[j]){
                i++;
                j++;
            } else {
                if(j > 0)
                    j = arr[j-1];
                else {
                    arr[i] = 0;
                    i++;
                }
            }
        }
        return arr;
    }
    static int strStr__(String word, String pattern) {
        int[] temp = computeTemporaryArray__(pattern);
        int i = 0,j = 0;
        while (i < word.length() && j < pattern.length()) {
            if(j == pattern.length() - 1)
                return i-j;
            else if(word.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                if(j > 0) {
                    j = temp[j-1];
                } else {
                    i++;
                }
            }
        }
        return -1;
    }
}
