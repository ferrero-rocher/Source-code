package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        MaxInt(a, b, c);
        MinInt(a, b, c);
    }

    static void MaxInt(int a, int b, int c) {

        if (a > b & a > c) {

            System.out.println(a + " is biggest");
        } else if (b > c) {

            System.out.println(b + " is biggest");
        } else {
            System.out.println(c + " is biggest");
        }

    }

    static void MinInt(int a, int b, int c) {
        if (a < b & a < c) {

            System.out.println(a + " is smallest");
        } else if (b < c) {

            System.out.println(b + " is smallest");
        } else {
            System.out.println(c + " is smallest");
        }
    }
}
