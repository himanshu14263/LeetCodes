package com.leetcode.himanshu.codes;

import java.util.*;
public class CodeForces {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
          String s = sc.next();
          if(s.contains("R")==false) System.out.println(s.length()+1);
          else if(s.contains("L")==false) System.out.println(1);
          else{
              int max=Integer.MIN_VALUE;
              int l=0;
              for(int i=0;i<s.length();i++){
                  if(s.charAt(i)=='R'){
//                      System.out.println((i+1)-(l));
                      max=Math.max(max,(i+1)-(l));
                      l=i+1;
                  }
              }
//              System.out.println(s.length()+1-l);
              max=Math.max(max,s.length()+1-l);
              System.out.println(max);
          }
        }
    }
}
