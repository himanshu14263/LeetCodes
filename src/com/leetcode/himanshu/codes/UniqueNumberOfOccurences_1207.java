package com.leetcode.himanshu.codes;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumberOfOccurences_1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }

        Map<Integer,Integer> map2 = new HashMap<>();
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            if(map2.containsKey(entry.getValue())){
                map2.put(entry.getValue(),map2.get(entry.getValue())+1);
            }
            else{
                map2.put(entry.getValue(),1);
            }
        }

        boolean flag = true;

        for(Map.Entry<Integer,Integer> entry : map2.entrySet()){
            if(entry.getValue() != 1){
                flag=false;
            }
        }
        return flag;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,1,1,3};
        uniqueOccurrences(arr);
    }
}
