package com.leetcode.himanshu.codes;

import java.util.*;

public class CodeForces {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-- > 0) {
            for(int i=0;i<9;i++){
               String s = sc.next();
               s = s.replace('1','2');
               System.out.println(s);
            }
        }
    }
}
