package com.company;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumn=0;
        int sumo=0;
        int sume=0;
        while(true)
        {
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if (n<0)
            {
                sumn=sumn+n;
                System.out.println("sum of negative number is "+" "+sumn);
                System.out.println("sum of positive even number is "+" "+sume);
                System.out.println("sum of positive odd number is "+" "+sumo);
            }
            else if (n==0)
            {
                break;
            }

            else

                {
                    if (n%2==0)
                    {
                        sume = sume+n;
                        System.out.println("sum of negative number is "+" "+sumn);
                        System.out.println("sum of positive even number is "+" "+sume);
                        System.out.println("sum of positive odd number is "+" "+sumo);
                    }
                    else
                    {
                        sumo = sumo+n;
                        System.out.println("sum of negative number is "+" "+sumn);
                        System.out.println("sum of positive even number is "+" "+sume);
                        System.out.println("sum of positive odd number is "+" "+sumo);
                    }

                }



        }
    }
}
