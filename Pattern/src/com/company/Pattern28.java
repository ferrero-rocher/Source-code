package com.company;

public class Pattern28 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1 ; row< 2*n ; row++)
        {
            int ColInRow = row>n?2*n-row:row;                  // calculate conditions for no of stars
            int NoOfSpace = row>n?row-n:n-row;             // calculate condition for space
            for(int s =1;s<=NoOfSpace;s++)
            {
                System.out.print(" ");

            }

            for(int col = 1 ;col<=ColInRow ;col++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
