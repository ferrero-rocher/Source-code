package com.company;

public class PrimRec {
    public static void main(String[] args) {
        System.out.println(IsPrime(12,2));

    }
    static boolean IsPrime(int n , int i)
    {
        if(i==n/2)
        {
            return true;
        }
        if(n%i==0)
        {
            return false;
        }
        return IsPrime(n,i+1);


    }
}
