package com.codeforces.round644;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int ans = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i!=j){
                        ans = Math.min(ans,Math.abs(arr[i]-arr[j]));
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
