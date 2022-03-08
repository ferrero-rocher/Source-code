package com.company;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        int amount = sc.nextInt();
        System.out.println("Enter Discount in percentage");
        int dis = sc.nextInt();
        float fp = (amount*dis)/100;
        System.out.println(amount-fp);
    }
}
