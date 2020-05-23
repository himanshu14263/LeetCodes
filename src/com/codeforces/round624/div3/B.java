package com.codeforces.round624.div3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            int[] arrSort = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                arrSort[i]=arr[i];
            }
            Arrays.sort(arrSort);
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<m;i++){
                int val = sc.nextInt();
                val--;
                set.add(val);
                set.add(val+1);
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(arrSort));
            System.out.println(set);
            String ans = "YES";
            for(int i=0;i<n;i++){
                if(arr[i]!=arrSort[i]){
                    if(set.contains(i)==false){
                        ans="NO";
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
