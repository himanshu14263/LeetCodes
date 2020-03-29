package com.leetcode.himanshu.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class LuckyNumber_1380 {

    public static List<Integer> luckyNumbers (int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] minRow = new int[row][col];
        int[][] maxCol = new int[row][col];

        List<Integer>minList = new ArrayList<>();
        List<Integer>maxList = new ArrayList<>();

        for(int[] r : matrix){
            int[] temp = r.clone();
            Arrays.sort(temp);
            minList.add(temp[0]);
        }

        for(int i=0;i<matrix[0].length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                max = Math.max(max,matrix[j][i]);
            }
            maxList.add(max);
        }

        int[] minListArr = minList.stream().mapToInt(i->i).toArray();
//        System.out.println(Arrays.toString(minListArr));
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                minRow[i][j]= minListArr[i];
            }
        }

        int[] maxListArr = maxList.stream().mapToInt(i->i).toArray();
//        System.out.println(Arrays.toString(maxListArr));
        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                maxCol[i][j]=maxListArr[j];
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == minRow[i][j] && matrix[i][j] == maxCol[i][j]){
                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
    }

    public static void main(String[] args){
        int[][] mat = {
                {36376,85652,21002,4510},
                {68246,64237,42962,9974},
                {32768,97721,47338,5841},
                {55103,18179,79062,46542}
        };

        System.out.println(Arrays.toString(luckyNumbers(mat).stream().mapToInt(i->i).toArray()));;
    }
}
