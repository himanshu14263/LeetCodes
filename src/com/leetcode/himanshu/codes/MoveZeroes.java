package com.leetcode.himanshu.codes;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(s!=i){
                    nums[s]^=nums[i];
                    nums[i]^=nums[s];
                    nums[s]^=nums[i];
                }
                s++;
            }
            else{
                continue;
            }
        }
//        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args){
        int[] arr = {1,0,8,0,0,3,0};
        moveZeroes(arr);
    }
}
