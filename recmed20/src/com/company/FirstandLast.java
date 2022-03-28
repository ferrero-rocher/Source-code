package com.company;

import java.util.Arrays;

public class FirstandLast {
    public static void main(String[] args) {

        String s = "abaacdaefaah";
       // char target='a';
        int [] res= new int[2];
        System.out.println(Arrays.toString(Position(s,res,0,'a')));


    }
    static boolean seen = false;
    static int[] Position(String s,int[] res,int index,int target)
    {
        if(index==s.length())
        {
            return res;
        }
        if(s.charAt(index)==target)
        {
            if(!seen)
            {
                res[0]=index;
                seen=true;
            }
            res[1]=index;
        }
        return Position(s,res,++index,target);
    }



}
