package com.codeforces.round611;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean[] isGetting = new boolean[n];
            Set<Integer> notGiving = new HashSet<>();
            Set<Integer> notGetting = new HashSet<>();
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i]!=0){
                    isGetting[arr[i]-1]=true;
                }
                if(arr[i]==0){
                    notGiving.add(i+1);
                }
            }
            for(int i=0;i<n;i++){
                if(isGetting[i]==false){
                    notGetting.add(i+1);
                }
            }
            System.out.println(Arrays.toString(isGetting));

            System.out.println(notGetting);
            System.out.println(notGiving);

            boolean[] used = new boolean[notGetting.size()];
            Arrays.fill(used,false);
            int[] a = notGetting.stream().mapToInt(i->i).toArray();
            int[] b = notGiving.stream().mapToInt(i->i).toArray();

            for(int i=0;i< a.length;i++){
                for(int j=0;j<b.length;j++){
                    if(a[i]!=b[j] && used[j]==false){
                        arr[b[j]-1]=a[i];
                        used[j]=true;
                        break;
                    }
                }
            }

        System.out.println(Arrays.toString(arr));

    }
}
