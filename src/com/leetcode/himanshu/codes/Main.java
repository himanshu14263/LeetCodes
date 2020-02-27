package com.leetcode.himanshu.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    static void reverse(int[] arr, int s, int e){
        while(s<e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {

	    int arr[] = {1,2,3,4,5};
	    int k = 197;
	    int len = arr.length;
	    k = k % len;
	    int md = len-k;

	    reverse(arr,0,md-1);
	    reverse(arr,md,len-1);
	    reverse(arr,0,len-1);

	    System.out.println(Arrays.toString(arr));
    }
}
