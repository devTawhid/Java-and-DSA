package com.qString;

public class p1668MaximumRepeatingSubstring {
    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba", word = "aaaba";
//        System.out.println(maxRepeating(sequence,word));
        checkOnesSegment("0110");
    }

    static int maxRepeating(String sequence, String word) {
        StringBuilder str = new StringBuilder(sequence);
        int counter = 0;
        while (str.indexOf(word) != -1) {
            int res = sequence.indexOf(word);
            str.delete(res, word.length());
            System.out.println(str);
            counter++;
        }
        return counter;
    }

    static int maxRepeating_(String sequence, String word) {
        String find="";
        while(sequence.contains(find)) {
            find += word;
            System.out.println(find);
        }
        return (find.length()-word.length())/word.length();
    }

    static boolean checkOnesSegment(String s) {
        int count = 0;
        StringBuilder str = new StringBuilder("tawhid");
        System.out.println(str.replace(5,6,"D"));
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1) == s.charAt(i) && s.charAt(i) == '1') {
                return true;
            }
        }
        return false;
    }
    static String reversePrefix(String word, char ch) {
        int lim = word.indexOf('d');
        StringBuilder str = new StringBuilder(word);
        for(int i = 0; i < lim / 2; i++) {
            swap(str,i,lim - 1 - i);
        }
        return str.toString();
    }
    static void swap(StringBuilder str, int i, int j) {
        char temp = str.charAt(i);
        str.replace(i,i+1, String.valueOf(str.charAt(j)));
        str.replace(j,j+1, String.valueOf(temp));
    }
}
