package com.leetcode.himanshu.codes;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            Map<Integer, Integer>map = new HashMap<>();
            Map<Integer, Integer>map2 = new HashMap<>();
            String ans = "YES";
            for(int i=0;i<n;i++){
                int val = sc.nextInt();
                map2.put(val,map2.getOrDefault(val,0)+1);
                if(map.containsKey(val)){
                    int index = map.get(val);
                    if(i-index>1){
                        ans="NO";
                    }
                    map.put(val,i);
                }
                else{
                    map.put(val,i);
                }
            }
            if(ans=="NO"){
                ans="NO";
            }
            else{
                Set<Integer>set = new HashSet<>();
                for(Map.Entry<Integer,Integer> entry : map2.entrySet()){
                    set.add(entry.getValue());
                }
                if(set.size() != map2.size()){
                    ans="NO";
                }
            }
            System.out.println(ans);

        }

    }
}
