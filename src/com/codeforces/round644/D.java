package com.codeforces.round644;

import java.util.Scanner;
public class D {
    public static boolean checkPrime(long n ){
        for(long i=2;i<=n/2;i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            if(k>=n){
                System.out.println(1);
            }
            else{
                long ans=n;
                for(long i=1;i*i<=n;i++){
                    if(n%i==0){
                        if(i<=k){
                            ans = Math.min(ans,n/i);
                        }
                        if(n/i <= k){
                            ans = Math.min(ans,i);
                        }
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
