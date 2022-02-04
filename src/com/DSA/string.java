package com.DSA;

import java.util.Arrays;

public class string {
    public static void main(String[] args) {
//        String name = "tawhid";
//        String name1 = "tawhid";
//        System.out.println(name);
//        System.out.println(name.equals(name1));
//        System.out.println(Arrays.toString(args));

        // working with integer
//        System.out.println(new Integer(56).toString());
//        System.out.println(new Integer(89).toString() + 'a');

        //
//        System.out.printf("Hello this is %s, who are you?", "tawhid");

        //pretty printing
//        float val = 12.3254f;
//        System.out.printf("this value is: %.2f", val);
//        System.out.printf("This is the value of pi:%f and this is rounded:%.4f", Math.PI,Math.PI);
//        System.out.println("\n" + Math.PI);

        //string performance
//        String series = "";
//        for (int i = 0; i < 26; i++) {
//            //wrong
//            series += "a + i";
//            //wrong
//            series += "a" + i;
//            //the correct one
//            series += (char)('a' + i);
//            System.out.println(series);
//        }

        //string builders: unlike String data type it is mutable
//        StringBuilder str = new StringBuilder();
//        str.append("ajhkljhklj");
//        System.out.println(str);
//        str.reverse();
//        System.out.println(str);

        //Sting methods
        String name = "Tawhid";
        System.out.println(name.toCharArray()[1]);
        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
