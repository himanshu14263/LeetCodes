package com.codeforces.round617;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long val = sc.nextLong();
            long ans = val;
            int count=0;
            while(val > 0){
                long add = val/10;
                ans += add;
                val = add;
                count++;
            }
            System.out.println(ans+count-1);
        }
    }
}
