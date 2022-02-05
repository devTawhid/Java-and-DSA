package com.DSA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

    }
    static String sortSentence_(String s) {
        return Arrays
                .stream(s.split(" "))
                .sorted(Comparator.comparingInt(word -> word.charAt(word.length() - 1)))
                .map(word -> word.substring(0, word.length() - 1))
                .collect(Collectors.joining(" "));
    }
}
