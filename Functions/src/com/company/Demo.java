package com.company;

public class Demo {
    public static void main(String[] args) {
        int a =3;
        int b =10;

        for(int i=a ; i<=b; i++)
        {
            int flag =1;
            for(int j =2;j<=(i)/2;j++)
            {
                if(i%j==0)
                {
                    flag = 0;
                    break;
                }

            }

            if(flag==1)
            {
                System.out.println(i);
            }




        }

    }
}
