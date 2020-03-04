package com.leetcode.himanshu.codes;

public class SubtractProdAndSum {
    public static int difference(int n){
        int sum = 0;
        int prod = 1;

        while(n>0){
            int digit = n%10;
            sum+=digit;
            prod*=digit;
            n/=10;
        }
        return prod-sum;
    }
}
