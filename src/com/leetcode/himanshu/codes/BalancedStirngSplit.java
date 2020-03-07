package com.leetcode.himanshu.codes;

public class BalancedStirngSplit {
    public int balancedStringSplit(String s) {
        int result=0;
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                count--;
            }
            else{
                count++;
            }
            if(count == 0){
                result++;
            }
        }
        return result;
    }
}
