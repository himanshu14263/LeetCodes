package com.leetcode.himanshu.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayByParity_905 {
    public static int[] sortArrayByParity(int[] A) {

        List<Integer> list = new ArrayList<>();
        for(int i:A){
            if(i%2 ==0){
                list.add(i);
            }
        }
        for(int i:A){
            if(i%2 != 0){
                list.add(i);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args){

        int[] arr = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));;
    }
}
