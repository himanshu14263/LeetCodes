package com.leetcode.himanshu.codes;

public class IpAddress {
    public String defangIPAddress(String ip){
        System.out.println(ip);
        ip = ip.replaceAll("[.]","[.]");
        System.out.println(ip);
        return ip;
    }
}
