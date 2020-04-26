package com.leetcode.himanshu.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;


public class LeetCodes {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static void preO(TreeNode root){
        if(root==null)return;
        preO(root.left);
        System.out.println(root.val);
        preO(root.right);
    }

    public static void levelOrderBottomHelper(TreeNode root,int level,List<List<Integer>>ans){
        if(root==null)return;
        if(ans.get(level-1)==null){
            ans.add(level-1,new ArrayList<>());
            ans.get(level-1).add(root.val);
            levelOrderBottomHelper(root.left,level+1,ans);
            levelOrderBottomHelper(root.right,level+1,ans);
        }
        else{
            ans.get(level-1).add(root.val);
            levelOrderBottomHelper(root.left,level+1,ans);
            levelOrderBottomHelper(root.right,level+1,ans);
        }
    }

    public static int findLevels(TreeNode root){
        if(root==null)return 0;
        return Math.max(1+findLevels(root.left),1+findLevels(root.right));
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<List<Integer>> revans = new ArrayList<>();
        int levels = findLevels(root);
        for(int i=0;i<levels;i++){
            ans.add(new ArrayList<>());
        }
        levelOrderBottomHelper(root,1,ans);
        for (int i = 0; i <levels ; i++) {
            revans.add(0,ans.get(i));
        }
        return revans;
    }

    public static void func(List<List<Integer>>list,int n){
        list.get(0).add(1);
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    list.get(i).add(j,1);
                }
                else{
                    list.get(i).add(j,list.get(i-1).get(j)+
                            list.get(i-1).get(j-1));
                }
            }
        }
    }
    public static void main(String[] args) {
        List<List<Integer>>list = new ArrayList<>();
        int n = 5;
        for(int i=0;i<5;i++){
            list.add(new ArrayList<>());
        }
        func(list,n);
        System.out.println(list);
    }
}
