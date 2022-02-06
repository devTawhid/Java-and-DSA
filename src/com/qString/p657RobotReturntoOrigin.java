package com.qString;

public class p657RobotReturntoOrigin {
    public static void main(String[] args) {
        System.out.println(judgeCircle("LL"));
    }
    static boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i) == 'U')
                x++;
            if(moves.charAt(i) == 'D')
                x--;
            if(moves.charAt(i) == 'L')
                y++;
            if(moves.charAt(i) == 'R')
                y--;
        }
        return x == 0 && y == 0;
    }
}
