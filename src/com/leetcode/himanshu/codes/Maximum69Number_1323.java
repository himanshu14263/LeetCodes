package com.leetcode.himanshu.codes;

public class Maximum69Number_1323 {

    public static int maximum69Number (int num) {
        char[] numArr = String.valueOf(num).toCharArray();
        int max = num;
        for(int i=0;i<numArr.length;i++){
            char ch = numArr[i];
            numArr[i]='9';
            int newVal = Integer.parseInt(new String(numArr));
            if(newVal>max)max=newVal;
            numArr[i]=ch;
        }
        return max;
    }

    public static void main(String[] args){
        System.out.println(maximum69Number(9999));;
    }
}
