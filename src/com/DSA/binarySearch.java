package com.DSA;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 9, 10, 15, 25, 50, 100, 200};
        char[] chars = {'c','f','j'};
        int[] firstLast = {1,1,1,2,3,3,3,3,3,5,7,8,9};
        int[] mountainArr = {1,3,5,4,2};
        int target = 25;
        int result = binarySearch(arr, 25);
        int ceil = ceil(arr, 20);
        int floor = floor(arr, 20);
        char ch = nextGreatestLetter(chars, 'e');

//        System.out.println(result);
//        System.out.println(ceil);
//        System.out.println(floor);
//        System.out.println(ch);
//        System.out.println(Arrays.toString(searchRange(firstLast,3)));
        System.out.println(findInMountainArray(mountainArr, 5));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            // calculates new mid
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                // sets new start according to the changed mid
                start = mid + 1;
            } else if (arr[mid] > target) {
                // sets new end according to the changed mid
                end = mid - 1;
                // returns the index if found
            } else
                return mid;
        }

        return -1;
    }

    //question 1:
    static int ceil(int[] arr, int target) {
        int start = 0, end = arr.length;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if(target > arr[mid])
                start = mid + 1;
            else if(target < arr[mid])
                end = mid - 1;
            else
                return mid;
        }
        return start;
    }

    //question 2:
    static int floor(int[] arr, int target) {
        int start = 0, end = arr.length;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if(target > arr[mid])
                start = mid + 1;
            else if(target < arr[mid])
                end = mid - 1;
            else
                return mid;
        }
        return end;
    }

    //question 3: 744 find smallest letter greater than target
    //some notes:
    //1. exact same approach for ceil
    //2. ignore the target == what we are looking for ?????
    // TODO: 07-Feb-22 :think why we are removing the == check
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if(target > letters[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return letters[start % letters.length];
    }

    //question 4: 34 find first and last position of element in sorted array
    static int[] searchRange(int[] nums, int target) {
        return new int[] {searchRangeHeplper(nums,target,true), searchRangeHeplper(nums,target,false)};
    }
    static int searchRangeHeplper(int[] nums, int target, boolean isFirst) {
        int start = 0, end = nums.length;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if(target > nums[mid])
                start = mid + 1;
            else if(target < nums[mid])
                end = mid - 1;
            else {
                if(isFirst)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return isFirst ? start: end;
    }

    //question 5: search in an infinite array
    static int infiniteBinarySearch(int[] arr, int target) {
        int start = 0,end = 1;
        while (target > arr[end]) {
            int val = infiniteBinarySearchHelper(arr,15,start,end);
            if(val != -1)
                return val;
            else {
                int gap = end - start;
                start = end + 1;
                end = start + 2 * gap;
            }
        }
        return -1;
    }
    static int infiniteBinarySearchHelper(int[] arr, int target, int start, int end) {

        while (start <= end){
            // calculates new mid
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                // sets new start according to the changed mid
                start = mid + 1;
            } else if (arr[mid] > target) {
                // sets new end according to the changed mid
                end = mid - 1;
                // returns the index if found
            } else
                return mid;
        }

        return -1;
    }

    //question 6: find peak in a bitonic array/ Mountain array
    // TODO: 07-Feb-22 => try returning the start instead of end and see what happens
    static int mountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start < end) {
            mid = (start + end) >> 1;
            if(arr[mid] < arr[mid+1])
                start = mid + 1;
            else
                end = mid;
        }
        return end;
    }

    //question 7: search in a bitonic array/ Mountain array
    static int findInMountainArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start < end) {
            mid = (start + end) >> 1;
            if(arr[mid] < arr[mid+1])
                start = mid + 1;
            else
                end = mid;
        }
        int res = -1;
        res = fInMouHelper(arr,target,0,end);
        if(res == -1)
            fInMouHelper(arr,target,end+1,arr.length-1);

        //fInMouHelper(arr,target,0,end) != -1? fInMouHelper(arr,target,0,end): fInMouHelper(arr,target,end+1,arr.length-1);
        return res;
    }
    static int fInMouHelper(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;

            if(isAsc) {
                if(arr[mid] < target) start = mid + 1;
                else end = mid - 1;
            }else{
                if(arr[mid] < target) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}
