package com.leetcode.himanshu.codes;

public class ReverseWordsInString3 {

    public static void reverseArr(char[] arr,int i, int j){
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static String reverseWords(String s, int n) {
        char[] arr = s.toCharArray();
        if(n<s.length()){
            for(int i=0;i<s.length();i+=(2*n)){
                int st = i;
                int ed= i+n-1;
                if(ed<s.length()){
                    reverseArr(arr,i,i+n-1);
                }
            }
        }
        else{
            reverseArr(arr,0,arr.length-1);
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(reverseWords(str,8));
    }
}
