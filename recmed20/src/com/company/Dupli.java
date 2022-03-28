package com.company;

import java.util.HashSet;

public class Dupli {
    public static void main(String[] args) {
        String s = "abbccda";
        String res="";
        System.out.println(RemoveDup(s,res,0));


    }
    static HashSet <Character> set = new HashSet<>();
    static String RemoveDup(String s, String res, int index)
    {
        if(index==s.length())
        {
            return res;
        }
        if(!set.contains(s.charAt(index)))
        {
            set.add(s.charAt(index));
            res = res + s.charAt(index);
        }
        return RemoveDup(s,res,++index);
    }
}
