package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int large=0;
        while(true)
        {
            System.out.println("Enter a number ");
            int num = sc.nextInt();
            if (num>large)
            {
                large=num;
                System.out.println(large);
            }
            else if(num==0)
            {
                break;
            }
            else
            {
                System.out.println(large);
                ;
            }
        }



    }
}
