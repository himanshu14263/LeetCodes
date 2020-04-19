package com.leetcode.himanshu.codes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SetMismatch_645 {

    public static int[] findErrorNums(int[] nums) {
        Map<Integer,Integer>map = new TreeMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int duplicate = 0;
        int missing = 0;
        for(int i=1;i<=nums.length;i++){
            if(map.containsKey(i)){
                if(map.get(i) == 2){
                    duplicate = i;
                }
            }
            else{
                missing = i;
            }
        }
        int[] result = new int[2];
        result[0]=duplicate;
        result[1]=missing;
        return result;
    }

    public static void main(String[] args){
        int arr[] = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
}
