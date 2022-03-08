package com.company;

public class Demo2 {
    public static void main(String[] args) {
        int n = 5556;
        int res = Happyone(n);
        int sol = 1;
        if (res > 99) {
            sol = Happytwo(res);

        }
        if (sol<99 )
        {
            int ans=Happyone(sol);
            if(ans==1)
            {
                System.out.println(" happy");
            }
            else
            {
                System.out.println("Not happy");
            }
        }
        System.out.println("happy");



    }
    static int Happyone(int n)
    {
        while (n > 1 & n < 100) {
            int a = n / 10;
            int b = n % 10;
            n = a * a + b * b;

        }
        return n;
    }
    static int Happytwo(int n)
    {
        while (n > 100 & n < 1000) {
            int a = n / 100;
            int rem = n % 100;
            int b = rem / 10;
            int c = rem % 10;
            n = a * a + b * b + c * c;
        }
        return n;
        
    }




}
