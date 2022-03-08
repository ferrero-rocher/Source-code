package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(Prime(n));

    }
    static boolean Prime(int n)
    {   if(n<=1)
        {
        return false;
        }
        for(int i =2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
