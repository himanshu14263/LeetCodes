package com.leetcode.himanshu.codes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NRepeatedElements_961 {
    public static int repeatedNTimes(int[] A) {
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i:A){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }

        Set<Integer> keys = map.keySet();
        Iterator<Integer> itr = keys.iterator();
        while(itr.hasNext()){
            int key = itr.next();
            if(map.get(key) > 1){
                result = key;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,3};
        System.out.println(repeatedNTimes(arr));
    }
}
