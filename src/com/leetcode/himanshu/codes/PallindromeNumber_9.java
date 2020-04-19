package com.leetcode.himanshu.codes;

public class PallindromeNumber_9 {

    public static boolean isPalindrome(int x) {
        String str1 = new StringBuilder(String.valueOf(x)).toString();
        String str = new StringBuilder(String.valueOf(x)).reverse().toString();
        return str1.equals(str);
    }

    public static void main(String[] args) {
        int t = 121;
        System.out.println(isPalindrome(t));
    }
}
