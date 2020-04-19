package com.leetcode.himanshu.codes;

import java.util.Arrays;

public class SortArrayByParity2 {
    public static int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        int oi = 1;
        int ei = 0;

        for(int i=0;i<A.length;i++){
            if((A[i]&1) == 1 ){
                result[oi]=A[i];
                oi+=2;
            }
            else{
                result[ei]=A[i];
                ei+=2;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }
}
