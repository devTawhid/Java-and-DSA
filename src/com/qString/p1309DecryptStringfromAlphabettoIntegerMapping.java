package com.qString;

import java.util.Arrays;

public class p1309DecryptStringfromAlphabettoIntegerMapping {
    public static void main(String[] args) {
        String s = "10#11#12";
        freqAlphabets(s);
    }

    static String freqAlphabets(String s) {
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(i < s.length() - 2 && s.charAt(i+2) == '#'){
                int val = ((int)s.charAt(i) - 48) * 10 + (int)s.charAt(i+1) - 48 + 96;
                st.append((char)val);
                i = i + 2;

            }else {
                int val = ((int)s.charAt(i) - 47)  + 95;
                st.append((char)val);
            }
        }
        return st.toString();
    }
}
