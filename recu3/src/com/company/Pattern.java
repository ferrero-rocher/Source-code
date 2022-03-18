package com.company;

public class Pattern {
    public static void main(String[] args) {
        PrintStar(1,5);

    }
    static void PrintStar(int row , int n)
    {
        if(row==n+1)
        {
            return;
        }


        PrintStar(++row,n);
        for(int col=1;col<row;col++)
        {
            System.out.print("*");
        }
        System.out.println();


    }
}
