package com.questions;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);

        for(int i = 153; i <= 999; i++){
            isArmstrong(i);
        }
    }
    {
    // unknown return statement issue.
//    static boolean isPrime(int n) {
//        if(n == 1){
//            return false;
//        }
//        for(int i = 2; i * i < n; i++ ){
//            if(n % i == 0){
//                return false;
//            }else {
//                return true;
//            }
//        }
//    }
    }

    static boolean isPrime(int n) {
        if(n == 1){
            return false;
        }
        for(int i = 2; i * i < n; i++ ){
            if(n % i == 0){
                return false;
            }else {
                return true;
            }
        }
        return false;
    }

    static void isArmstrong(int n){
        int t = (int)(n / 100);
        int s = (int)((n / 10) % 10);
        int f = (int)(n % (t * 100 + s * 10));

//        System.out.println(t + " " + s + " " + f);
        if(t*t*t + s*s*s + f*f*f == n) {
            System.out.println("It is a Armstrong number: " + n);
        }
    }
}
