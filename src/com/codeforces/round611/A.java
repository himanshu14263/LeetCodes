package com.codeforces.round611;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
           int h = sc.nextInt();
           int m = sc.nextInt();

           int hans = (23-h);
           int mans = (60-m);
           if(hans==0){
               System.out.println(mans);
           }
           else{
               System.out.println(hans*60+mans);
           }
        }
    }
}
