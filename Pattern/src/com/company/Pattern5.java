package com.company;

public class Pattern5 {
    public static void main(String[] args) {
        for(int row =0 ; row<5;row++)
        {
            for(int col=0; col<=row ;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int row =0 ; row<4;row++)
        {
            for(int col=0; row+col<4 ;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
