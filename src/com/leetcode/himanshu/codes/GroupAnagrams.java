package com.leetcode.himanshu.codes;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] keyArr = strs[i].toCharArray();
            Arrays.sort(keyArr);
            String key = new String(keyArr);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }
            else{
                map.put(key,new ArrayList<>());
                map.get(key).add(strs[i]);
            }
        }

        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
    public static void main(String[] args){
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(arr));;
    }
}
