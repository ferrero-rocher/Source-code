package com.company;

public class twopwr {
    public static void main(String[] args) {
        System.out.println(power(1));

    }
    static int power(int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n==1)
        {
            return 2;
        }
        return 2 * power(n-1);
    }
}
