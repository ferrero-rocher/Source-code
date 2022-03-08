package com.company;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum =0;
        int count=1;
        System.out.println("Enter no of elements");
        int n = sc.nextInt();
        while (count<=n)
        {
            System.out.println("enter element");
            int a = sc.nextInt();
            sum= sum+ a;
            count++;
        }
        System.out.println(sum/n);



    }
}
