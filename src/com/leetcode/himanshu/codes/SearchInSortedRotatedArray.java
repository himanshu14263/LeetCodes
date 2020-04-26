package com.leetcode.himanshu.codes;

public class SearchInSortedRotatedArray {

    private static int findPivot(int[] arr,int l, int h){
        if(l>h)return -1;
        if(l==h)return l;
        int md = (l+h)/2;
        if(md<h && arr[md]>arr[md+1])return md;
        if(l<md && arr[md]<arr[md-1])return md-1;
        if(arr[l]>=arr[md])return findPivot(arr,l,md-1);
        return findPivot(arr,md+1,h);
    }

    public static int BS(int[] arr,int l, int h, int val){
        if(l<=h){
            int md = (l+h)/2;

            if(arr[md]==val)return md;

            if(val>=arr[md]){
                return BS(arr,md+1,h,val);
            }
            else{
                return BS(arr,l,md-1,val);
            }
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int ans = -1;
        int pivot = findPivot(nums,0,nums.length-1);
        int leftAns = BS(nums,0,pivot,target);
        int rightAns = BS(nums,pivot+1,nums.length-1,target);
        if(leftAns!=-1)return leftAns;
        return rightAns;
    }

    public static void main(String[] args) {
        int[] arr = {6,7,8,9,0,1,2,3};
        System.out.println(search(arr,4));
    }
}
