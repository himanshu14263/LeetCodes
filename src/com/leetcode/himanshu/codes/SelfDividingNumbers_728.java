package com.leetcode.himanshu.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfDividingNumbers_728 {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for(int i=left;i<=right;i++){
            int num = i;
            int tempNum = i;
            boolean flag = true;
            while(tempNum > 0 ){
                int digit = tempNum%10;
                if(digit ==0 ){
                    flag = false;
                    break;
                }
                if(num%digit != 0 ){
                    flag = false;
                }
                tempNum/=10;
            }
            if(flag == true){
                list.add(i);
            }
        }

        return list;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(selfDividingNumbers(1,22).stream().mapToInt(i->i).toArray()));;
    }
}
