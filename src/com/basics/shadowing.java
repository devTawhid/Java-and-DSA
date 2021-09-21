package com.basics;

public class shadowing {
    //    int a = 10;// but this won't work. We need to do this
    static int x = 10;//this is correct. We need to
    // shadowing means scope of highter level will be hidden by the lower level scope
    // hence we can say that higher level is shawed
    public static void main(String[] args) {
        System.out.println(x);
        int x = 30; // this is variable is shadowing the line 5. Since that is in higher level
        int y;
//        System.out.println(y);// error because scope will begin when the value is initialized
        y = 50;
        System.out.println(y); // now it will not give any error since y initialized and the scope has begin in the previous line
        System.out.println(x);
    }
}
