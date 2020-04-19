package com.leetcode.himanshu.codes;

import java.util.Stack;

public class ValidParentheses_20 {
    public static boolean isValid(String s) {
        boolean ans = false;
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' ||
               s.charAt(i)=='{' ||
               s.charAt(i)=='['){
                count++;
            }
            else if(
                    s.charAt(i)==')' ||
                    s.charAt(i)=='}' ||
                    s.charAt(i)==']'
            )
                count--;
        }
        if(count == 0 )
            ans=true;

        return ans;
    }
    public static void main(String[] args) {
        String s = "()]";
        System.out.println(isValid(s));
    }
}
