package com.company;

public class MoveX {
    public static void main(String[] args) {
        String s = "axbcxxd";
        String res="";
        int l=s.length();
        String ans = ExceptX(s,res,0);
        int m=ans.length();
        while(m<l)
        {
            ans=ans+'x';
            m++;
        }
        System.out.println(ans);
    }

    static String ExceptX( String s, String res, int index)
    {
        if(index==s.length())
        {
            return res;
        }
        if(s.charAt(index)!='x')
        {
            res= res+s.charAt(index);
        }
        return ExceptX(s,res,++index);
    }
}
