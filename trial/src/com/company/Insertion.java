package com.company;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int [] a = {4,2,3,6,1};
        for(int i=0 ;i<a.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else
                {
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(a));






    }
}
