package com.codeforces.round624.div3;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            int[] arr = new int[26];
            Arrays.fill(arr,0);
            for(int i=0;i<m;i++){
                int val = sc.nextInt();
                val--;
                for(int j=0;j<=val;j++)
                {
                    sb.append(s.charAt(j));
                }
            }
            for(int i=0;i<sb.length();i++){
                arr[sb.charAt(i)-'a']++;
            }

            for(int i=0;i<26;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
