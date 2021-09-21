package com.basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        float num = input.nextInt();
//        int num2 = input.nextFloat(); this will not work

//        type casing
//        int num = (int) (67.45f);

//        automatic type promotion

//        int a = 128;
//        byte b = (byte) (a);
//        System.out.println(b);
//        byte a = 40;
//        byte b = 15;
//        int c = a * b; // automatic type promotion in happening here.
//        System.out.println(c);

        byte b = 45;
        char c = 'a';
        short sh = 1024;
        int i = 5000;
        float fl = 5.651f;
        double db = .125;
        double result = (fl * b) + (i / c) - (db * sh);
        // float + int - double = double
        System.out.println((fl * b) + " " + (i / c) + " " + (db * sh));
        System.out.println(result);
    }
}
