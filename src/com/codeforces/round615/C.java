package com.codeforces.round615;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            List<List<Integer>> list = new ArrayList<>();
            int x=0,y=0;
            List<Integer> temp = new ArrayList<>();
            temp.add(x);temp.add(y);
            list.add(temp);
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='L') x--;
                else if(s.charAt(i)=='R')x++;
                else if(s.charAt(i)=='U')y++;
                else if(s.charAt(i)=='D')y--;
                List<Integer> temp2 = new ArrayList<>();
                temp2.add(x);temp2.add(y);
                list.add(temp2);
            }
            Map<List<Integer>,Integer>map = new HashMap<>();
            int ans = Integer.MAX_VALUE;
            int start = 0;
            int end = 0;
            for(int i=0;i<list.size();i++){
                if(map.containsKey(list.get(i))){
                    int index = map.get(list.get(i));
//                    ans = Math.min(ans,Math.abs(index-i));
                    if(ans>(i-index)){
                        ans = i-index;
                        start = index;
                        end = i;
                    }
                    map.put(list.get(i),i);
                }
                else{
                    map.put(list.get(i),i);
                }
            }
//            System.out.println(ans);
//            System.out.println(start+" "+end);
            if(ans!=Integer.MAX_VALUE){
                System.out.println((++start)+" "+end);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
