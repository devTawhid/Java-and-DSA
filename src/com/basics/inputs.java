package com.basics;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        System.out.println(input.next());
//        String str = input.nextLine();
//        System.out.println(str);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        float sum = num1 + num2;
        System.out.println(sum);
    }
}
