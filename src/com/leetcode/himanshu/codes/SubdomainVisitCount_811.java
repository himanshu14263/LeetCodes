package com.leetcode.himanshu.codes;

import java.lang.reflect.Array;
import java.util.*;

public class SubdomainVisitCount_811 {

    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String>result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for(int i=0;i<cpdomains.length;i++){
            String temp[] = cpdomains[i].split(" ");
            int count = Integer.parseInt(temp[0]);
            String domain = temp[1];
            int index = 0;

            while(index != -1){
                map.put(domain,map.getOrDefault(domain,0)+count);
                index = domain.indexOf('.');
                domain = domain.substring(index+1);
            }

        }
        for(Map.Entry<String, Integer>entry:map.entrySet()){
            result.add(entry.getValue()+" "+entry.getKey());
        }
        return result;
    }

    public static void main(String[] args){
        String[] str = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        System.out.println(subdomainVisits(str));
    }
}
