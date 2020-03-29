package com.leetcode.himanshu.codes;

import java.util.*;

public class SortIntegerByNumberOf1Bits_1356 {
    public static int[] sortByBits(int[] arr) {

        Map<Integer,List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for(int i=0;i<arr.length;i++){
            int bitCount = Integer.bitCount(arr[i]);
            if(map.containsKey(bitCount)){
                List<Integer> list = map.get(bitCount);
                list.add(arr[i]);
                map.put(bitCount,list);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                map.put(bitCount,list);
            }
        }

        int[] result = new int[arr.length];
        int i=0;
        for(Map.Entry<Integer, List<Integer>>entry:map.entrySet()){
            List<Integer>list = entry.getValue();
            Collections.sort(list);
            for(Integer val : list){
                result[i++]=val;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int arr[] = {1024,4,1,64,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
}
