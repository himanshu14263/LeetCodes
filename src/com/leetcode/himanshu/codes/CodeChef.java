package com.leetcode.himanshu.codes;
// Java program to count numbers with n divisors
import java.util.*;

class CodeChef {

    static long MOD = 1000000007;

    static long fastExp(long x, long y) {
        long res = 1L;
        while (y > 0) {
            if (y % 2 == 1)
                res = (res * x) % MOD;
            y >>= 1;
            x = (x * x) % MOD;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long a = sc.nextLong();
            long ans = 0;
            long p = 1;
            for(int i=1;i<=n;i++){
                long k = (2*i)-1;
                p = fastExp(a,k);
                ans = (ans+p)%MOD;
                a = (a*p)%MOD;
            }
            System.out.println(ans);
        }
    }
}
