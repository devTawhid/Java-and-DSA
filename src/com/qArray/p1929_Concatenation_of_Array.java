package com.qArray;

public class p1929_Concatenation_of_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        getConcatenation(nums);
    }
    static int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] arr = new int[2*size];
        for(int i = 0; i < 2 * size; i++){
            int j = i % size;
            arr[i] = nums[j];
        }
        System.out.println(nums);
        return arr;
    }
}
