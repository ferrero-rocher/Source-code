package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int num= sc.nextInt();
        while(num>0)
        {
            int temp=num%10;
            if(temp==3)
            {
                count++;
                num=num/10;
            }
            else
            {
                num=num/10;
            }
        }
        System.out.println(count);
    }
}
