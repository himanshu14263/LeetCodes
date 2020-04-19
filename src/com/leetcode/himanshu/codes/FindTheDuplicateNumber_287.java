package com.leetcode.himanshu.codes;

import java.util.Arrays;

public class FindTheDuplicateNumber_287 {
    public static int findDuplicate(int[] nums) {
        int ans = 0;

        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]-nums[i+1]==0)ans=nums[i];
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {1,1};
        System.out.println(findDuplicate(arr));
    }
}
