package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Sum(a,b);
        System.out.println(sum);

    }
    static int Sum(int a , int b)
    {
     int res= a+b;
     return res;
    }
}
