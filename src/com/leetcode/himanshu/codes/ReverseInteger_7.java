package com.leetcode.himanshu.codes;

public class ReverseInteger_7 {
    public static int reverse(int x) {
        boolean flag = false;
        if(x<0){
            flag=true;
            x*=-1;
        }
        String str = String.valueOf(x);
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        int ans = 0;
        try{
            ans = Integer.parseInt(new String(s));
        }
        catch(NumberFormatException e){
            return 0;
        }
        if(flag)ans*=-1;
        return ans;
    }

    public static void main(String[] args) {
        int key = 1534236469;
        System.out.println(reverse(key));;
    }
}
