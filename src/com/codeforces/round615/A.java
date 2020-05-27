package com.codeforces.round615;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long n = sc.nextLong();

            long max = Math.max(Math.max(a,b),c);

            long diff = 0;
            diff += (Math.abs(a-max));
            diff += (Math.abs(b-max));
            diff += (Math.abs(c-max));

            if(diff>n){
                System.out.println("NO");
            }
            else{
                if(Math.abs(diff-n)%3==0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
