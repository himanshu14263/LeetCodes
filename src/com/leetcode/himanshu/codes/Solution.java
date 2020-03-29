package com.leetcode.himanshu.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
//            sc.nextLine();
            int max =0;
            Map<String,Integer> map = new TreeMap<>();
            while(n-- > 0){
                st = new StringTokenizer(br.readLine());
                String key = st.nextToken();
                if(key.equals("top")){
                    Map.Entry<String, Integer> maxEntry = null;

                    int maxVal = max;

                    StringBuilder ss = new StringBuilder();
                    for (Map.Entry<String, Integer> entry : map.entrySet()){
                        if(entry.getValue() == maxVal){
                            ss.append(entry.getKey()+" ");
                        }
                    }

                    System.out.println(ss.toString().trim());
                }
                else{
                    int val = Integer.parseInt(st.nextToken());
                    if(val > max)
                        max = val;
//                    sc.nextLine();
                    if(map.containsKey(key)){
                        map.put(key,map.get(key)+val);
                        if(map.get(key) > max)
                            max = map.get(key);
                    }
                    else{
                        map.put(key,val);
                    }
                }
            }
        }
    }
}