package com.leetcode.himanshu.codes;

public class ReverseString {
    public static void reverseString(char[] chArr){
        int i=0,j=chArr.length-1;

        while(i<j){
            chArr[i] = (char) (chArr[i]^chArr[j]);
            chArr[j] = (char) (chArr[i]^chArr[j]);
            chArr[i] = (char) (chArr[i]^chArr[j]);
            i++;j--;
        }

        System.out.println(chArr);
    }
}
