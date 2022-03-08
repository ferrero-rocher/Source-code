package com.company;

public class Pattern5b {

    public static void main(String[] args) {
        int n=5;
        for(int row=1 ; row< 2*n ; row++)
        {
            int ColInRow = row>n?2*n-row:row;
            for(int col = 1 ;col<=ColInRow ;col++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
