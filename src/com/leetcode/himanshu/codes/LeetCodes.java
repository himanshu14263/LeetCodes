package com.leetcode.himanshu.codes;

import java.util.*;

public class LeetCodes{

    public static int removeElement(int[] nums, int val) {

        int ans = nums.length;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                count++;
            }
        }

        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j++]=nums[i];
            }
        }

        System.out.println(Arrays.toString(nums));
        return ans-count;

    }

    public static void main(String[] args) {
        int[] arr = {0,0,2,3,4,5,1,2,3,2,3};
        removeElement(arr,2);
    }
}
