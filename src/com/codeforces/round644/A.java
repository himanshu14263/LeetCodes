package com.codeforces.round644;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int min = Math.min(a,b);
            min = 2*min;
            int side = Math.max(min,Math.max(a,b));
            System.out.println(side*side);
        }
    }
}
