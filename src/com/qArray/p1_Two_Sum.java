package com.qArray;

public class p1_Two_Sum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
//        twoSumRaw(arr, 9);
        twoSum(arr,9);
    }

    /**
     *
     * @param nums: the array need to be searched
     * @param target: the summed value
     * @return the index array size 2
     */
    static int[] twoSumRaw(int[] nums, int target) {
        int[] indexs = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    indexs[0] = i;
                    indexs[1] = j;
                    break;
                }
            }
        }
//        System.out.println(Arrays.toString(indexs));
        return indexs;
    }
    static int[] twoSum(int[] nums, int target){

        return null;
    }
}
