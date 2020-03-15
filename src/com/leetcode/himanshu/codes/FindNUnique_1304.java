package com.leetcode.himanshu.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNUnique_1304 {
    public static int[] sumZero(int n) {
        List<Integer>l = new ArrayList<>();
        if(n%2 == 1)l.add(0);
        n=n/2;
        while(n > 0){
            l.add(n);
            l.add(-n);
            n--;
        }
        return l.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(sumZero(6)));
    }
}
