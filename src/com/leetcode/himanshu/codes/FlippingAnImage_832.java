package com.leetcode.himanshu.codes;

import java.util.Arrays;

public class FlippingAnImage_832 {

    public static int[][] flipAndInvertImage(int[][] A) {
        for(int[] row:A){
            int i = 0;
            int j = row.length-1;
            
            while(i<j){
                row[i] = row[i]^row[j];
                row[j] = row[i]^row[j];
                row[i] = row[i]^row[j];
                i++;j--;
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(A[i][j]==1){
                    A[i][j]=0;
                }
                else{
                    A[i][j]=1;
                }
            }
        }
        return A;
    }

    public static void main(String[] args){
        
        int[][] mat = {{1,1,0},{1,0,1},{0,0,0}};
        
        flipAndInvertImage(mat);
    }
}
