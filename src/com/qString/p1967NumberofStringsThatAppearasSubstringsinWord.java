package com.qString;

public class p1967NumberofStringsThatAppearasSubstringsinWord {
    public static void main(String[] args) {
        String[] patterns = {"a", "abc", "bc", "d"};
        String  word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }
    static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String ptr: patterns) {
            if(word.contains(ptr))
                count++;
        }
        return count;
    }
}
