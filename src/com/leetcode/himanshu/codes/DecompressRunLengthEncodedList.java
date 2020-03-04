package com.leetcode.himanshu.codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DecompressRunLengthEncodedList {
    public static int[] decompress(int nums[]){

        List<Integer> vec = new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int a = nums[i];
            int b = nums[i+1];
            while(a-- > 0){
                vec.add(b);
            }
        }
        int[] result = vec.stream().mapToInt(i -> i).toArray();
        return result;
    }
}
