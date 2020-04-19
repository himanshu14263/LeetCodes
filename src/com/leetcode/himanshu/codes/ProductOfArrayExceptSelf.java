package com.leetcode.himanshu.codes;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int cz = 0;
        int total = 1;
        int inx = -1;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cz++;
                inx = i;
                continue;
            }
            total*=nums[i];
        }
        if(cz == 0){
            for (int i = 0; i < nums.length; i++) {
                ans[i] = total/nums[i];
            }
        }
        else if(cz == 1){
            for (int i = 0; i < nums.length; i++) {
                ans[i] = 0;
            }
            ans[inx]=total;
        }
        else{
            for (int i = 0; i < nums.length; i++) {
                ans[i] = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]  arr = {1,2,0,4,0};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
