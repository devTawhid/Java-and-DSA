package com.qString;

public class p1662CheckIfTwoStringArraysareEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        arrayStringsAreEqual(word1, word2);
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }

    //faster used stringBuilder
    public boolean arrayStringsAreEqual_(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder ();
        StringBuilder sb2 = new StringBuilder ();

        for (String word : word1) {
            sb1.append (word);
        }

        for (String word : word2) {
            sb2.append (word);
        }

        return sb1.toString ().equals (sb2.toString ());
    }

}
