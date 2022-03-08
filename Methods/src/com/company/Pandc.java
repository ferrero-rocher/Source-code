package com.company;

import java.util.Scanner;

public class Pandc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact1=1;
        int fact2=1;
        int fact3=1;
        System.out.println("Enter n");
        Integer n = sc.nextInt();
        System.out.println("Enter r");
        Integer r = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact1 = fact1*i;
        }
        for(int i = 1; i<=r;i++)
        {
            fact2 = fact2*i;
        }
        for(int i = 1;i<=n-r;i++)
        {
            fact3 = fact3*i;
        }
        System.out.println("Combination :"+fact1/fact3);
        System.out.println("Permuatation "+fact1/(fact3*fact2));
    }
}
