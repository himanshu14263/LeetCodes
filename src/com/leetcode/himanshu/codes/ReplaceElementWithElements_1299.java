package com.leetcode.himanshu.codes;

import java.util.Arrays;

public class ReplaceElementWithElements_1299 {

    public static int[] replaceElements(int[] arr) {

        int last = arr.length-1;
        int max=arr[last];
        arr[last]=-1;
        for(int i=last-1 ; i>=0 ; i--){
            int tempMax = max;
            if(arr[i]>max){
                max=arr[i];
            }
            arr[i] = tempMax;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));;
    }
}
