package com.leetcode.himanshu.codes;

public class RobotReturnToOrigin_657 {
    public static boolean judgeCircle(String moves) {

        int l=0,r=0,u=0,d=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U')u++;
            if(moves.charAt(i)=='D')d++;
            if(moves.charAt(i)=='L')l++;
            if(moves.charAt(i)=='R')r++;
        }

        boolean ans = false;
        if(l==r && u==d){
            ans = true;
        }
        else{
            ans = false;
        }

        return ans;
    }

    public static void main(String[] args){
        String str = "UD";
        System.out.println(judgeCircle(str));;
    }
}
