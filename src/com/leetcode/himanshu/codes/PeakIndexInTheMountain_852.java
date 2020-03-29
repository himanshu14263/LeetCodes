package com.leetcode.himanshu.codes;

public class PeakIndexInTheMountain_852 {
    public static int peakIndexInMountainArray(int[] A) {
        int ansIndex = 0;
        for(int i=1;i<A.length-1;i++){
            if(A[i]>A[i-1] && A[i]>A[i+1]){
                ansIndex = i;
            }
        }
        return ansIndex;
    }

    public static void main(String[] args){
        int arr[] = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));;
    }
}
