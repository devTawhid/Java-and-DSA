package com.qString;

import java.util.Arrays;

public class p58LengthofLastWord {
    public static void main(String[] args) {
        String s = "a";
        lengthOfLastWord(s);
    }
    static int lengthOfLastWord(String s) {
        int length = 0, i = s.length()-1;
        while(i >=0 && s.charAt(i) == ' ') i--;
        while(i >=0 && s.charAt(i) != ' ') {
            i--;
            length++;

        }
        return length;
    }
}
