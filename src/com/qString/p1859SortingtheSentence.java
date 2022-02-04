package com.qString;

import java.util.Arrays;

public class p1859SortingtheSentence {
    public static void main(String[] args) {
        String s = "Myself2 Me1 I4 and3";
        System.out.println(sortSentence(s));
    }

    // 1st one
    static String sortSentence(String s) {
        String[] ans = new String[s.split(" ").length];

        for (String str:s.split(" ")) {
            ans[str.charAt(str.length() - 1) - '1'] = str.substring(0, str.length() - 1);
        }

        return String.join(" ", ans);
    }

    static String sortSentence_testing(String s) {
        StringBuilder str = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) == ' ') {
//                int num = i - 1;
//                System.out.println(s.charAt(num));
//            }if(i == s.length() - 1)
//                System.out.println(s.charAt(i));
//        }
        String[] ans = new String[s.split(" ").length];
        System.out.println(s.split(" ")[1].charAt(s.split(" ")[1].length() - 1) - '1');
        System.out.println();
        System.out.println();
        for(String st: s.split(" ")){
//            System.out.println(Arrays.toString(ans));
            ans[st.charAt(st.length()-1) - '1'] = st.substring(0,st.length()-1);
//            System.out.println(Arrays.toString(ans));
//            System.out.println();
        }
        return String.join(" ", ans);
//        System.out.println(s.split(" ").length);
//        return str.toString();
    }
}
