package com.qBinarySearch;

public class aQ3p744FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {

    }

    /**
     * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
     * @param letters: array of character
     * @param target: the char in question
     * @return the result
     */
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(letters[mid] <= target) start = mid + 1; // error was here
            else end = mid - 1;
        }
        return letters[start % letters.length];
    }
}
