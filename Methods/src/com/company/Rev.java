package com.company;
import java.lang.*;

import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s1= sc.next();
        String rev="";
        for(int i=s1.length(); i>0;i--)
        {
            char ch = s1.charAt(i-1);
            rev= rev+ch;
        }
        System.out.println(rev);



    }
}
