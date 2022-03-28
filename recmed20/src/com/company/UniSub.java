package com.company;

import java.util.HashSet;

public class UniSub {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        System.out.println(Subsequence("aaaa","",hs));

    }

    static HashSet<String> Subsequence(String s , String res , HashSet<String> hs)
    {
        if(s.isEmpty())
        {
            hs.add(res);
            return hs;

        }
        char current = s.charAt(0);
        Subsequence(s.substring(1),res+current,hs);
        return Subsequence(s.substring(1),res,hs);


    }
}
