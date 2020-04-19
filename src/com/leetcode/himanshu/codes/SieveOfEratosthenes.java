package com.leetcode.himanshu.codes;

import java.util.*;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0 ){
            int x = sc.nextInt();
            int k = sc.nextInt();

            if(x == 1 && k ==0){
                System.out.println(1);
            }
            else{
                if((2*k)<=x) System.out.println(1);
                else
                    System.out.println(0);
            }
        }
    }
}

