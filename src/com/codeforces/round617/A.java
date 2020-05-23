package com.codeforces.round617;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int countOdd=0;
            for(int i=0;i<n;i++){
                int val = sc.nextInt();
                if(val%2==1)countOdd++;
            }
            int remaining = n-countOdd;
            if(remaining==0){
                if(countOdd%2==1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                if(countOdd>0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
