package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for(int row=0 ;row<5;row++)
        {
            for(int col=0 ; row+col<5 ; col++)
            {
               System.out.print("*");
            }
            System.out.println();

        }
    }
}
