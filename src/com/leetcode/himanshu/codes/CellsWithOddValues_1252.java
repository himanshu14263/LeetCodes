package com.leetcode.himanshu.codes;

public class CellsWithOddValues_1252 {

    public static int oddCells(int n, int m, int[][] indices) {
        int count = 0;
        int[][] mat = new int[n][m];

        for (int i = 0; i < indices.length; i++) {
            for (int row = 0; row < n; row++) {
                mat[row][indices[i][1]]++;
            }
            for (int col = 0; col < m; col++) {
                mat[indices[i][0]][col]++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] % 2 == 1) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 1},
                {0, 0}
        };

        System.out.println(oddCells(2, 2, mat));
        ;
    }
}
