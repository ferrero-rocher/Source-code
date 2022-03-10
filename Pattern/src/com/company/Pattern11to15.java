package com.company;

public class Pattern11to15 {
    public static void main(String[] args) {
        int n;
        Pattern17(4);

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

    static void Pattern13(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int space=row;space<n;space++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++)
            {
                if(col==1 || col==2*row-1 || row==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void Pattern30(int n)
    {
        for(int row =1 ;row<=5;row++)
        {
            for(int space=row ; space<n ;space++)
            {
                System.out.print("  ");
            }

            for(int colleft=row ; colleft>=1 ; colleft--)
            {
                System.out.print(colleft+" ");
            }

            for(int colright =2 ; colright<=row ; colright++)
            {
                System.out.print(colright+" ");
            }
            System.out.println();
        }
    }

    static void Pattern17(int n)
    {
        for(int row =1 ;row<=2*n-1;row++)
        {
            int colSpace = row >n?row-n:n-row;
            int columnLeft = row> n ? 2*n-row:row;
            int columnRight =row>n ? 2*n-row:row;

            for(int space=1 ; space<=colSpace ;space++)

            {
                System.out.print("  ");
            }

            for(int colleft=columnLeft ; colleft>=1 ; colleft--)
            {
                System.out.print(colleft+" ");
            }

            for(int colright =2 ; colright<=columnRight ; colright++)
            {
                System.out.print(colright+" ");
            }
            System.out.println();
        }
    }
}
