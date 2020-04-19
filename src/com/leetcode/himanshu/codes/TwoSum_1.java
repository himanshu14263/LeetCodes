package com.leetcode.himanshu.codes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int otherNum = target-nums[i];
            if(map.containsKey(otherNum) && i!=map.get(otherNum)){
                return new int[]{i,map.get(otherNum)};
            }
            map.put(nums[i],i);
        }
        return new int[]{1,1};
    }
    public static void main(String[] args) {
        int[] arr = {3,3};
        System.out.println(Arrays.toString(twoSum(arr,6)));;
    }
}
