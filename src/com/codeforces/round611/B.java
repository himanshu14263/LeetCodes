package com.codeforces.round611;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();

            if(n%k <= (k/2)){
                System.out.println(n);
            }
            else{
                System.out.println(n - ((n%k)-(k/2)));
            }
        }
    }
}
