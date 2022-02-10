package com.qString;

import java.util.Stack;

public class p20ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("([}}])"));
    }
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if(c == ')') {
                if(!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            }
            else if(c == '}') {
                 if(!stack.isEmpty() && stack.peek() == '{')
                    stack.pop();
                 else
                     return false;
            }
            else if(c == ']') {
                if(!stack.isEmpty() &&  stack.peek() == '[')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
