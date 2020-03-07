package com.leetcode.himanshu.codes;

public class FindNumbersWithEvenNoOfDigits_1295 {
    public int findNumbers(int[] nums) {
        int a = nums[0];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int length = String.valueOf(nums[i]).length();
            //        int length = (int)(Math.log10(a)+1);
            if((length & 1) != 1){
                count++;
            }
        }
        return count;
    }
}
