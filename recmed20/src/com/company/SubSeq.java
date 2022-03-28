package com.company;

public class SubSeq {
    public static void main(String[] args) {

        String s = "abc";
        SubSequence(s,0,"");

    }

    static void SubSequence(String s , int index, String res)
    {

        if(index==s.length())
        {
            System.out.println(res);
            return;
        }

        SubSequence(s,index+1,res+s.charAt(index));
        SubSequence(s,index+1,res);
    }
}
