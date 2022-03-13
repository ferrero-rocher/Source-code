package com.company;

public class Powr {
    public static void main(String[] args) {
        double x =5;
        int n=-2;
        double ans =1;
        for(int i=-1;i>=n;i++)
        {
            ans=ans*(1/x);
        }
        System.out.println(ans);
    }
}
