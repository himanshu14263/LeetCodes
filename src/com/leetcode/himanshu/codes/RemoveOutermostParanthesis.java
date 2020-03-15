package com.leetcode.himanshu.codes;

import java.util.Stack;

public class RemoveOutermostParanthesis {

    public static String removeOuterParentheses(String S) {
        int len = S.length();
        char[] ch = S.toCharArray();
        Stack<Character> st = new Stack<>();
        int count=0;
        for(int i=0;i<len;i++){
            if(st.size() == 0) System.out.println(i);
            if(ch[i] == '(')st.push('(');
            if(ch[i] == ')')st.pop();
        }
        return new String(ch);
    }

    public static void main(String[] args){
        System.out.println("(()())(())");
        System.out.println(removeOuterParentheses("(()())(())"));;
    }
}
