package com.leetcode.himanshu.codes;

public class GenerateStringWithChar_1374 {
    public static String generateTheString(int n) {

        if(n==1)return "a";
        if(n==2)return "ab";
        if(n==3)return "abc";
        if(n%2==0){
            int a=n-1;
            int b=1;
            String str="";
            str = "a".repeat(a);
            str = str.concat("b");
            return str;
        }
        else{
            int a=n-2;
            String str="";
            str="a".repeat(a);
            str = str.concat("b");
            str = str.concat("c");
            return str;
        }
    }

    public static void main(String[] args){
        System.out.println(generateTheString(7));
    }
}
