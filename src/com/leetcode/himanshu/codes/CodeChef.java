package com.leetcode.himanshu.codes;
// Java program to count numbers with n divisors
import java.util.*;

class CodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long ans=0;
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = i; j < arr.length; j++)
                {
                    long product = 1;
                    for (int k = i; k <= j; k++)
                    {
                        product*=arr[k];
                    }
                    if((product%4==0) || (product%2==1)){
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
