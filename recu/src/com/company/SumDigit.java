package com.company;

public class SumDigit {
    public static void main(String[] args) {

        System.out.println(Sums(12345));
    }
    static int Sums(int n)
    {
        if(n<1)
        {
            return 0;
        }
        return n%10+ Sums(n/10);
    }
}
