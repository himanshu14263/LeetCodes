package com.leetcode.himanshu.codes;

public class DeleteColumnsToMakeSorted_944 {
    public static int minDeletionSize(String[] A) {
        int count = 0;
        int row = A.length;
        int col = A[0].length();
        int[][] mat = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = A[i].charAt(j)-'a';
            }
        }
        //each column's value should be increasing only
        for(int j=0;j<col;j++){
            boolean flag=true;
            for(int i=0;i<row-1;i++){
                if(mat[i][j]>mat[i+1][j]){
                    flag=false;
                    break;
                }
            }
            if(flag==false)count++;
        }
        return count;
    }

    public static void main(String[] args){
        String[] arr = {"zyx","wvu","tsr"};
        System.out.println(minDeletionSize(arr));
    }
}
