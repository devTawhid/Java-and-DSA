package com.basics;

import java.util.Scanner;

public class functionMethods {
    public static void main(String[] args) {
//        sum();
        String message = greeting();
        System.out.println(message);
    }

    static String greeting() {
        return "tawhid";
    }

    /*
     * access modefier, return type
     * */


    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = in.nextInt();
        System.out.println("Enter a number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
