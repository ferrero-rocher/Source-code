package com.company;

import java.util.Arrays;

public class Permarray {
    public static void main(String[] args) {
        int[] arr= {0,2,1,5,3,4};
        int[] res = new int[arr.length];

       for(int i =0; i <arr.length ; i++)
       {
           //System.out.println(arr[i]);
           int result =Positionarray(arr,arr[i]);
           Resultarray(res,result,i);
       }

        System.out.println(Arrays.toString(res));

    }

    static int Positionarray (int[] arr , int n)
    {
        return arr[n];
    }
    static void Resultarray (int[] res ,int result , int i)
    {
     res[i] = result;
    }
}
