package com.leetcode.himanshu.codes;

public class MagicNumber {
    public static boolean isHappy(int n) {
        boolean ans = true;

        int num = n;
        int newNum = 0;
        while(newNum!=1){
            newNum=0;
            while(num>0){
                int d = num%10;
                newNum += (d*d);
                num/=10;
            }
            num=newNum;
        }
        System.out.println(newNum);
        if(newNum==1)return true;
        return false;
    }
    public static void main(String[] args){
        isHappy(19);
    }

}
