package com.codeforces.round644;

import java.util.Arrays;
import java.util.Scanner;

public class C {

    public static boolean checkParity(int x, int y){
        if(x%2==0 && y%2==0)return true;
        if(x%2==1 && y%2==1)return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean[] arrBool = new boolean[n];
            Arrays.fill(arrBool,false);
            int even = 0;
            int odd = 0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]%2==0)even++;
                else odd++;
            }

            if(even%2==0 && odd%2==0){
                System.out.println("YES");
            }
            else{
                boolean flag=false;
                for(int i=0;i<n;i++){
                    for(int j=i;j<n;j++){
                        if(i!=j){
                            if(Math.abs(arr[i]-arr[j])==1){
                                --odd;
                                --even;
                                flag=true;
                                break;
                            }
                        }
                    }
                    if(flag)break;
                }
                if(even%2==0 && odd%2==0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
