package com.leetcode.himanshu.codes;

public class DecryptString_1309 {

    public static String freqAlphabets(String s) {
        char[] arr = s.toCharArray();
//        for(int i=0;i<arr.length;i++) System.out.println((char)(97+arr[i]-'0'));
//        System.out.println();
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(arr[i]=='#'){
                i--;
                int one = (char)(arr[i]-'0');i--;
                int two = (char)(arr[i]-'0');
                int num = two*10+one;
                System.out.println("num "+one+" "+two+" "+num);
                sb.append((char)('a'+num-1));
            }
           else{
//                System.out.println((char)('a'-1+arr[i]));
                sb.append((char)('a'-1+arr[i]-'0'));
            }
        }
        return new String(sb.reverse() );
    }

    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));;
//        int a = 1;
//        System.out.println((char)('a'-1+5));
    }
}
