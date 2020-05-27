package com.codeforces.round615;

import com.common.classes.MyPair;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Map<Integer,Integer>coorList=new TreeMap<>();
            int xc =0;
            int yc =0;
            while(n-- > 0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                coorList.put(x,y);
            }
            List<Map.Entry>list = new ArrayList<>(coorList.entrySet());
            System.out.println(list);
            String ans = "YES";
            StringBuilder sb = new StringBuilder();
            for(Map.Entry entry : list){
                if(((Integer)entry.getKey()-xc <0) || ((Integer)entry.getValue()-yc < 0)){
                    ans = "NO";
                    break;
                }
                else{
                    int rcount = (Integer)entry.getKey()-xc;
                    sb.append("R".repeat(rcount));
                    int ucount = (Integer)entry.getValue()-yc;
                    sb.append("U".repeat(ucount));
                    xc=(Integer)entry.getKey();
                    yc=(Integer)entry.getValue();
                }
            }
            if(ans.equals("NO")){
                System.out.println(ans);
            }
            else{
                ans = new String(sb);
                System.out.println(ans);
            }
        }
    }
}
