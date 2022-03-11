package com.company;

public class Main {

    public static void main(String[] args) {
        Print(5);
    }

    static void Print(int n)
    {
        if (n==0)
        {
            return ;
        }
        System.out.println(n);
        Print(n-1);


    }
}
