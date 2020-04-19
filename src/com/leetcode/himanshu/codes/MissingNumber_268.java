package com.leetcode.himanshu.codes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingNumber_268 {

    public static int missingNumber(int[] nums) {
        int ans = 0;

        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],1);
        }
        for(int i=0;i<=nums.length;i++){
            if(map.containsKey(i) == false){
                ans = i;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args){

        int[] arr = {0,1,2};
        System.out.println(missingNumber(arr));
    }
}
