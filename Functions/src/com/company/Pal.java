package com.company;

import java.util.Scanner;

public class Pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = Factorial(num);
        System.out.println(res);

    }
    static int Factorial(int n)
    {
        int fact =1;
        if (n==0|| n==1 )
        {
            return fact;
        }
        else
        {
            for(int i=2;i<=n;i++)
            {
                fact = fact*i;
            }
        }
        return fact;
    }
}
