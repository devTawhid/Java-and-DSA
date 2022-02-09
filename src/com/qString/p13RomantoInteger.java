package com.qString;

import java.util.HashMap;

public class p13RomantoInteger {
    public static void main(String[] args) {
        int[] str = {1000, 100, 1000, 10, 100, 1, 5};
        System.out.println(romanToInt(str));
    }
    static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int value = map.get(s.charAt(s.length() - 1));
        int i = s.length() - 1;
        System.out.println(i);
        while (i-- > 0) {
            System.out.println(i);
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                value -= map.get(s.charAt(i));
            }
            else {
                value += map.get(s.charAt(i));
            }
        }
        return value;
    }

    static int romanToInt4(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1); map.put('V',5);map.put('X',10);map.put('L',50);map.put('C',100);map.put('D',500);map.put('M',1000);
        int i = s.length() - 1, value = map.get(s.charAt(s.length() - 1));
        while (i-- > 0) value += map.get(s.charAt(i)) < map.get(s.charAt(i+1)) ? -map.get(s.charAt(i+1)): map.get(s.charAt(i+1));
        return value;
    }

    static int romanToInt(int[] s) {
        int value = s[s.length - 1];
        int i = s.length - 1;

        // TODO: 09-Feb-22 => to clear sufix and prefix these lines below are enough
//        int j = 6;                  // output
//        System.out.println(j--);    // 6
//        System.out.println(j);      // 5
//        System.out.println(--j);    // 4
//        System.out.println(j);      // 4

//        System.out.println();


//        while (--i >= 0) {
//            System.out.println(i);
//            if(s[i] < s[i+1]) {
//                value -= s[i];
//            }
//            else {
//                value += s[i];
//            }
//        }
        while (i-- > 0) value += s[i] < s[i+1] ? -s[i]: s[i];

        return value;
    }
}
