package com.codeforces.round617;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long val = sc.nextLong();
            long ans = val;
            while(val >= 10){
                long add = val/10;
                long remaining = val%10;
                ans += add;
                val = add+remaining;
            }
            System.out.println(ans);
        }
    }
}
