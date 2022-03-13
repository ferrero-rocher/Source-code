package com.company;

import java.util.HashMap;

public class FirstCap {
    public static void main(String[] args) {
        String s = "helloY";
//        for(int i=0;i<s.length();i++)
//        {
//            int res = s.charAt(i);
//            if(res<97)
//            {
//                System.out.println(s.charAt(i));
//            }
//        }
//
//        int x =HasCapital(s,0);
//        char res = (char)x;

        System.out.println((char)HasCapital(s,0));




    }

    static int HasCapital(String s , int i)
    {
        int res = s.charAt(i);
        if(res<97)
        {
            return res;
        }
        i++;
        return HasCapital(s,i);
    }




}
