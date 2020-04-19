package com.leetcode.himanshu.codes;

import java.util.*;

public class TheKWeakestRowInAMatrix_1337 {
    public static int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<mat.length;i++){
            int count = 0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1)count++;
            }
            map.put(i,count);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        int[] ans = new int[k];
        int i=0;
        for(Map.Entry<Integer,Integer>entry:list){
            if(i == k)break;
            ans[i++]=entry.getKey();
        }
        return ans;
    }
    public static void main(String[] args){
        int[][] mat =
                        {
                                {1,1,0,0,0},
                                {1,1,1,1,0},
                                {1,0,0,0,0},
                                {1,1,0,0,0},
                                {1,1,1,1,1}
                        };
       int k = 3;
        System.out.println(Arrays.toString(kWeakestRows(mat,k)));;
    }
}
