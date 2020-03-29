package com.leetcode.himanshu.codes;

import java.util.Arrays;

public class HeightChecker_1051 {
    public static int heightChecker(int[] heights) {
        int[] temp = heights.clone();
        Arrays.sort(temp);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i] != temp[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {5,1,2,3,4};
        System.out.println(heightChecker(arr));
    }
}
