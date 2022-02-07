package com.qString;

public class p925LongPressedName {
    public static void main(String[] args) {
        System.out.println(isLongPressedName("alex", "aaleex"));
    }

    static boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
//        while (i < name.length() && j < typed.length()) {
        // TODO: 07-Feb-22 why my the commented parts are wrong?
        while (j < typed.length()) {
//            if(name.charAt(i) == typed.charAt(j)){
            if(i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
//            }else if(j != 0 && typed.charAt(j-1) == typed.charAt(j))
            }else if(j != 0 && name.charAt(i-1) == typed.charAt(j))
                j++;
            else
                return false;
        }

//        return i == name.length() && j == typed.length();
        return i == name.length();
    }
}
