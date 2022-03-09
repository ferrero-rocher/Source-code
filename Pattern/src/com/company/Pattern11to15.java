package com.company;

public class Pattern11to15 {
    public static void main(String[] args) {
        int n;
        Pattern12(5);

    }
    static void Pattern11(int n)
    {
        for(int row =1 ;row <=n ; row++)
        {
            for(int space=1;space<=row;space++)
            {
                System.out.print(" ");
            }
            for(int col=row;col<=n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern12(int n)
    {
        for(int row =1 ;row <=2*n ; row++)
        {
            int RowSpace= row<=n?row:2*n-row+1;
            int RowStar = row<=n?n:2*row-n-1;


            for(int space=1;space<RowSpace;space++)
            {
                System.out.print(" ");
            }
            for(int col=row;col<=RowStar;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
