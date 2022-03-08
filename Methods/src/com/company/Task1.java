package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while(true)
        {
            System.out.println("Enter numbers");
            int num = sc.nextInt();
            if(num==0)
            {
                break;
            }
            else
                sum=sum+num;
                System.out.print("sum is:"+ sum);
        }
    }
}
