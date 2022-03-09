package com.company;

public class Pattern6to10 {
    public static void main(String[] args) {
        int n;
        Pattern9(5);

    }
    static void Pattern10(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n-row;col++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }


    }

    static void Pattern6(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int space=1;space<=n-row;space++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern7(int n)
    {
        for(int row=1;row<=n;row++)
        {

            for(int space=1;space<row;space++)
            {
                System.out.print(" ");
            }
           // System.out.println();


            for(int col=row;col<=n;col++)
            {
                System.out.print("*");
            }
            System.out.println();


        }
    }

    static void Pattern8(int n)
    {
        for(int row =1;row<=n;row++)
        {
            for(int space =1 ;space<=n-row; space ++)
            {
                System.out.print(" ");
            }
            for(int col =1;col<=2*row-1;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern9(int n)
    {
        for(int row =1;row<=n;row++)
        {
            for(int space =1 ;space<row; space ++)
            {
                System.out.print(" ");
            }
            for(int col =row;row+col<=2*n;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
