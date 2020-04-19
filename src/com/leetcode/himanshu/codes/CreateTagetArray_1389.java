package com.leetcode.himanshu.codes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CreateTagetArray_1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer>ll = new LinkedList<>();
        for(int i=0;i<index.length;i++){
            ll.add(index[i],nums[i]);
        }
        return ll.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
}
