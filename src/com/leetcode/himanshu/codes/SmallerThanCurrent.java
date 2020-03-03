package com.leetcode.himanshu.codes;

import java.util.Arrays;
import java.util.HashSet;

public class SmallerThanCurrent {
    public static int[] findSmaller(int[] nums){

        int[] result = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[j]<nums[i]){
                        count++;
                    }
                }
            }
            result[i] = count;
        }
        return result;
    }
}
