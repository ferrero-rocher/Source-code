package com.company;

import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        Add(a);


    }
    static void Add(int[] arr)
    {
        int k=arr.length;
        if(k<1)
        {

            return;
        }
        int[] temp = new int [k-1];
        for(int i=0;i<k-1;i++)
        {

            temp[i]=arr[i]+arr[i+1];
        }
        Add(temp);
        System.out.println(Arrays.toString(arr));
    }
}
