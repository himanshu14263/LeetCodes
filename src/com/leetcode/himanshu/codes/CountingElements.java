package com.leetcode.himanshu.codes;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountingElements {

    public static  int countElements(int[] arr) {
        int count=0;
        Map<Integer,Integer>map = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry entry:map.entrySet()){
            int key = (int)entry.getKey();
            if(map.containsKey(key+1)){
                count+=Math.min(map.get(key),map.get(key+1));
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(countElements(arr));;
    }
}
