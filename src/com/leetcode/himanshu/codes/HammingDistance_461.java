package com.leetcode.himanshu.codes;

public class HammingDistance_461 {

    public static int findPosition(int x){
        int pos=0;
        while(x>0){
            pos++;
            x>>=1;
        }
        return pos;
    }
    public static int hammingDistance(int x, int y) {
        int count=0;
        int pos=0;

        int xpos=findPosition(x);
        int ypos=findPosition(y);

        if(xpos>ypos){
            pos=xpos;
        }
        else{
            pos=ypos;
        }


        while(pos-- > 0){

            int xlb = x&1;
            x>>=1;
            int ylb =  y&1;
            y>>=1;

            if((xlb ^ ylb) == 1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(hammingDistance(1,4));;
    }
}
