package com.leetcode.himanshu.codes;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class RangeSumBst {
    public static int findSum(TreeNode root, int l, int r) {
        int result = 0;
        if (root == null) return 0;
        result += findSum(root.left, l, r);
        if(root.val>=l && root.val<=r){
            result+=root.val;
        }
        result += findSum(root.right, l, r);
        return result;
    }

    public static int rangeSumBST(TreeNode root, int L, int R) {
        int result = 0;
        int sum = findSum(root, L, R);
        return sum;
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);

        System.out.println(rangeSumBST(root,7,10));
    }
}
