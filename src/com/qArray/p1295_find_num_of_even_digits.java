package com.qArray;

public class p1295_find_num_of_even_digits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int result = findNumbers(nums);
        System.out.println(result);
    }

    /**
     * Question: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
     * @param nums: number to evens
     * @return the resulting
     */
    static public int findNumbers(int[] nums) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            String elem = Integer.toString(nums[i]);
            if(elem.toCharArray().length % 2 == 0){
                res++;
            }
        }
        return res;
    }

    /**
     * Kunal's way using log10 to find the digit count in number
     * @param nums
     * @return
     */
    static public int findNumbers_kunal(int[] nums){
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            int elem = (int)(Math.log10(nums[i])) + 1;
            if(elem % 2 == 0){
                res++;
            }
        }
        return res;
    }
}
