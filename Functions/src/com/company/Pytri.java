package com.company;

import java.util.Scanner;

public class Pytri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Triplet(a,b,c));


    }
    static boolean Triplet(int a , int b, int c)
    {
        return a * a + b * b == c * c || c * c + b * b == a * a || a * a + c * c == b * b;

    }
}
