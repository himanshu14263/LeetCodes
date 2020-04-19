package com.leetcode.himanshu.codes;

import java.util.*;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            p.add(i);
        }
        while(p.size()!=0 && p.size()!=1){
            int x = p.poll();
            int y = p.poll();
            if(x-y>0)p.add(x-y);
        }
        int ans = 0;
        if(p.size()==1){
            ans = p.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(arr));
    }
}
