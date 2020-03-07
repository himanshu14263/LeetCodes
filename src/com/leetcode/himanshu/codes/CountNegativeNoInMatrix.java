package com.leetcode.himanshu.codes;

public class CountNegativeNoInMatrix {

    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] arr : grid) {
            for (int i : arr) {
                if (i < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };
        System.out.println(countNegatives(grid));
    }
}
