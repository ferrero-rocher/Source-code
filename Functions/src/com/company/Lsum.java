package com.company;

import java.util.Scanner;

public class Lsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter till n");
        int n = sc.nextInt();
        int res= Sum(n);
        System.out.println(res);

    }

    static int Sum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum = sum+i;
        }
        return sum;
    }




}
