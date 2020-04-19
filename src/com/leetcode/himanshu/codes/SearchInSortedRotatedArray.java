package com.leetcode.himanshu.codes;

public class SearchInSortedRotatedArray {

    int findPivot(int[] arr,int l, int h){
        if(l<=h){
            int md = (l+h)/2;
            if(arr[md]<arr[md-1]){
                return md;
            }
            if(arr[md]>arr[l]){
                findPivot(arr,md+1,h);
            }
            else{
                findPivot(arr,l,md-1);
            }
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int ans = -1;

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        search(arr,7);
    }
}
