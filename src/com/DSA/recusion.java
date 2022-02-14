package com.DSA;

public class recusion {
    static int fibo(int val) {
        if(val < 2)
            return 1;
        return fibo(val-1) + fibo(val-2);
    }

    static int fact(int val) {
        if(val <= 2)
            return val;
        return val * fact(val-1);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        if(start > end)
            return -1;
        int mid = (start + end) >> 1;
        if(target > nums[mid])
            return binarySearch(nums, target, mid+1, end);
        else if(target < nums[mid])
            return binarySearch(nums, target, start, mid-1);
        return mid;
    }

    static void fun(int n) {
        // here it will print descending order
        System.out.println(n);
        if(n == 0) {
            return;
        }
        fun(n-1);
        // it will print ascending order
        System.out.println(n);
    }

    static int countSumDigit(int n) {
        if(n > 0 && n < 9)
            return n;
        return n%10 + countSumDigit(n/10);
    }

    static void funCheck(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        funCheck(--n); // n-- won't work
    }

    static int revNum(int n) {
        if(n%10 == n)
            return n;
        return (n%10) * (int)Math.pow(10,(int)(Math.log10(n))) + revNum(n/10);
    }

    static boolean palindrom(int n) {
        if(n%10 == n)
            return true;
        // and in the if check we are checking the first and last digit's equality
        // first n/10^7 -> here 7 is the digit count
        // last n % 10
        if(n/((int)Math.pow(10,(int)Math.log10(n))) == n%10) {
            return palindrom(n%((int)Math.pow(10, (int)Math.log10(n)))/10);
            // here we are making 123321 to 2332
            // to do that first remove the first digit n = n % 10^7 = 23321 -> here 7 is the digit count
            // then we need to remove the last digit  n = n/10 = 2332
        }
        return false;
    }

    static int countZeros(int n) {
        int count = 0;
        return countZerosHelper(n,count);
    }

    private static int countZerosHelper(int n, int count) {
        if(n%10 == 0)
            ++count;
        if(n%10 == n)
            return count;
        return countZerosHelper(n/10,count);
    }

    static int numberOfSteps(int n) {
        int count = 0;
        return numberOfStepsHelper(n, count);
    }

    private static int numberOfStepsHelper(int n, int count) {
        if(n == 0)
            return count;
        else if(n%2 == 0)
            return numberOfStepsHelper(n/2, ++count);
        return numberOfStepsHelper(n-1, ++count);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,5,8,9};
        // recording the current time
        long start = System.nanoTime();

        // code is running here;
//        fun(5);


        // calculating the time elapsed
        long end = System.nanoTime() - start;
        int seconds = (int) (end / 1000000000);
        int milliseconds = (int) (end / 1000000) % 1000;
        int nanoseconds = (int) (end % 1000000);
        System.out.printf("%ds %dms %dns \n", seconds, milliseconds, nanoseconds);
        System.out.println(numberOfSteps(14));
    }

}
