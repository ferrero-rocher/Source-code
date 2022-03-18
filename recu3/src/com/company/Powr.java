package com.company;

public class Powr {
    public static void main(String[] args) {


        System.out.println(myPow(0.00001,2147483647));

    }
    static  double myPow(double x, int n) {

        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return (1/x)*myPow(x,n+1);
        }
        return x*myPow(x,n-1);

    }
}
