package com.qString;

public class p1678GoalParserInterpretation {
    public static void main(String[] args) {
        System.out.println(interpret("(al)G(al)()()G"));
    }

    static String interpret(String command) {
        StringBuilder str = new StringBuilder(command);

        int i = 0, j = 1;
        while (i < str.length()) {
            if(str.charAt(i) == '(') {
                if (i < j && str.charAt(j) == ')') {
                    str.replace(i, j+1, "o");
                } else if(j < i) {
                    j = i + 1;
                } else if (str.charAt(j) == 'a') {
                    j += 2;
                    str.replace(i, j + 1, "al");
                    i += 2;
                }
            }
            else {
                i++;
                j = i + 1;
            }
        }

        return str.toString();
    }
}
