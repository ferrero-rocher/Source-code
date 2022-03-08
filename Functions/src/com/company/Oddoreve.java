package com.company;

import java.util.Scanner;

public class Oddoreve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = sc.nextInt();
        String res = OddorEve(num);
        System.out.println(num+"is"+res);

    }

    static String OddorEve(int a)
    {
        if (a%2==0)
        {
            return "even";
        }
        return "odd";
    }
}
