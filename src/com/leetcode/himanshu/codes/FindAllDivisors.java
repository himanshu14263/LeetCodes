package com.leetcode.himanshu.codes;

import java.util.*;

public class FindAllDivisors {
    public static void main(String[] args) {
            Map<Integer,Integer>map = new HashMap<>();
            map.put(1,1);
            for (int j = 0; j < 100; j++) {
                int count = 1;
                for(int i=1;i<=j/2;i++){
                    if(j%i==0)count++;
                }
                map.put(j,count);
            }
            System.out.println(map);
        }
}
