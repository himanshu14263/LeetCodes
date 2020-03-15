package com.leetcode.himanshu.codes;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class UniqueMorseCode_804 {
    public static int uniqueMorseRepresentations(String[] words) {

        HashMap<Character,String> hm = new HashMap<>();

        hm.put('a',".-");hm.put('f',"..-.");
        hm.put('b',"-...");hm.put('g',"--.");
        hm.put('c',"-.-.");hm.put('h',"....");
        hm.put('d',"-..");hm.put('i',"..");
        hm.put('e',".");hm.put('j',".---");

        hm.put('k',"-.-");hm.put('p',".--.");
        hm.put('l',".-..");hm.put('q',"--.-");
        hm.put('m',"--");hm.put('r',".-.");
        hm.put('n',"-.");hm.put('s',"...");
        hm.put('o',"---");hm.put('t',"-");

        hm.put('u',"..-");hm.put('x',"-..-");
        hm.put('v',"...-");hm.put('y',"-.--");
        hm.put('w',".--");hm.put('z',"--..");

        Set<String> set = new TreeSet<>();

        for(String word:words){
            String st = "";
            for(int i=0;i<word.length();i++){
                st = st.concat(hm.get(word.charAt(i)));
            }
            set.add(st);
        }
        return set.size();
    }

    public static void main(String[] args){

        String[] arr = {"gin", "zen", "gig", "msg"};
        System.out.println( uniqueMorseRepresentations(arr));;
    }
}
