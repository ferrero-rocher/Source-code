package com.company;

public class Demo1 {
    public static void main(String[] args) {
        int n =38;
//        int lastdigit;
//        int ans=0;
//        while(n>9)
//        {
//            lastdigit = n%10;
//            ans = ans+ lastdigit;
//            n=n/10;
//
//        }
//        System.out.println(ans);

        if (n == 0){
            System.out.println("0");
        }
        if (n % 9 == 0){
            System.out.println("9");
        }
        else {
            System.out.println(n % 9);
        }



    }
}
