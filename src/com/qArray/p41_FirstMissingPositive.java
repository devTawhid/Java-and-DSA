package com.qArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class p41_FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {-1,1,2,10,4,5};
//        firstMissingPositive(nums);
        firstMissingPositive3(nums);
    }

    /**
     * solution: 1 own way
     * @param nums : the array in question
     * @return : the missing positive integer
     */
    static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if(nums[i] > 0 && nums[i] <= n){
                arr[nums[i]] = 1;
            }
        }
        int j = 1;
        for (int i = 1; i <= n; i++) {
            if(arr[i] == 0) return i;
            else {
                j = j + 1;
                System.out.println(j);
            }
        }
        return j;
    }

    /**
     * solution: 2 very slow
     * @param nums : the array in question
     * @return : the missing positive integer
     */
    static int firstMissingPositive2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int i = 1;
        while (set.contains(i)){
            i++;
        }
        return i;
    }

    /**
     * solution: 3 fastest way
     * @param arr : the array in question
     * @return : the missing positive integer
     */
    static int firstMissingPositive3(int[] arr) {
        int L = 0;
        int R  = arr.length;

        while(L<R) {
            System.out.println(Arrays.toString(arr));
            if(arr[L] ==L+1) {
                L++;
            }
            else if (arr[L]<=L || arr[L]>R || arr[arr[L]-1]==arr[L] ) {
                swap(arr,L,--R);
            }
            else {
                swap(arr,L,arr[L]-1);
            }
        }

        return L+1;

    }
    static void swap (int[] arr, int L, int R) {
        int temp = arr[L];
        arr[L] = arr[R];
        arr[R] = temp;

    }
}
