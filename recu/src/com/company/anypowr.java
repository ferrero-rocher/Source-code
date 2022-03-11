package com.company;

public class anypowr {
    public static void main(String[] args) {
        System.out.println(power(3,4));

    }
    static int power(int a, int b)
    {
        if(b==0)
        {
            return 1;
        }
        if(b==1)
        {
            return a;
        }
        return a * power(a,b-1);
    }
}
