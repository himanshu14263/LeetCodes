package com.leetcode.himanshu.codes;

import java.lang.reflect.Array;
import java.util.*;

public class SquaresOfSortedArray_977 {


    public static int[] sortedSquares(int[] A) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<A.length;i++){
            list.add(A[i]*A[i]);
        }
        Collections.sort(list);
        return list.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args){

        int[] arr = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}
