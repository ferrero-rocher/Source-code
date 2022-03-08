package com.company;

import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Primelist(10,100);
    }
    static void Primelist(int a , int b)
    {
        for(int i=a ; i<=b; i++)
        {
            int flag = 1;
            for (int j =2;j<=i-1;j++)
            {
                if (i%j==0)
                {
                    flag = 0;
                    break;
                }
            }
            if (flag==1)
            {
                System.out.println(i);;
            }
        }

    }
}
