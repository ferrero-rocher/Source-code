package com.company;

public class ProNum {
    public static void main(String[] args) {
        System.out.println(Pro(5,2));

    }
    static int Pro(int a,int b)
    {   if(b==0)
        {
            return 0;
        }

        if(b==1)
        {
            return a;
        }
        return a+Pro(a,b-1);
    }
}
