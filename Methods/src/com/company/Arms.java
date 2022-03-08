package com.company;

import java.util.Scanner;

public class Arms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem;
        int ans=0;
        System.out.println("Enter a number ");
        int num= sc.nextInt();
        int temp=num;
        while(num>0)
        {
            rem=num%10;
            ans = ans+(rem*rem*rem);
            num=num/10;
        }
        if (ans==temp)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not a Armstrong");
        }
    }
}
