package com.codeforces.round624.div3;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            if(a==b){
                System.out.println(0);
            }
            else if(a<b){
               if(a%2==0 && b%2==0){
                   System.out.println(2);
               }
               else if(a%2==0 && b%2==1){
                   System.out.println(1);
               }
               else if(a%2==1 && b%2==0){
                   System.out.println(1);
               }
               else if(a%2==1 && b%2==1){
                   System.out.println(2);
               }
            }
            else{
                if(a%2==0 && b%2==0){
                    System.out.println(1);
                }
                else if(a%2==0 && b%2==1){
                    System.out.println(2);
                }
                else if(a%2==1 && b%2==0){
                    System.out.println(2);
                }
                else if(a%2==1 && b%2==1){
                    System.out.println(1);
                }
            }

        }
    }
}
