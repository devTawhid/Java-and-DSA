package com.basics;

// function overloading happens at compile time
public class functionOverloading {
    public static void main(String[] args) {
        fun(12);
        fun("tawhid");
//    fun('tawhid');//'' this is not allowed like javascript
    }


    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
}
