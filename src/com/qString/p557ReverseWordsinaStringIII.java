package com.qString;

import java.util.Arrays;

public class p557ReverseWordsinaStringIII {
    public static void main(String[] args) {
        // recording the current time
        long start = System.nanoTime();

        // code is running here;
        reverseWords("Let's take LeetCode contest");

        // calculating the time elapsed
        long end = System.nanoTime() - start;
        int seconds = (int) (end / 1000000000);
        int milliseconds = (int) (end / 1000000) % 1000;
        int nanoseconds = (int) (end % 1000000);
        System.out.printf("sec: %d milsec:%d nanosec:%d \n", seconds, milliseconds, nanoseconds);
        System.out.println(reverseWords("Let's take LeetCode contest"));

    }
    static String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            temp.append(s.charAt(s.length() - 1 - i));
        }
        int len = temp.toString().split(" ").length;
        for (int i = 0; i < len; i++) {
            if(i < len - 1)
                str.append(temp.toString().split(" ")[len - 1 - i] + " ");
            else
                str.append(temp.toString().split(" ")[len - 1 - i]);
        }

        return str.toString();
    }

}
