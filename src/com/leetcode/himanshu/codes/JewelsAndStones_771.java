package com.leetcode.himanshu.codes;

public class JewelsAndStones_771 {
    public static int numJewelsInStones(String J, String S) {
        int count =0;
        for(int i=0;i<J.length();i++){
            char ch = J.charAt(i);
            for(int j=0;j<S.length();j++){
                if(S.charAt(j) == ch){
                    count++;
                }
            }
        }
        return count;
    }
}
