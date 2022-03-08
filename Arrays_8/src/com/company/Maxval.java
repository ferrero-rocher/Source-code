package com.company;

import java.lang.reflect.Array;

public class Maxval {
    public static void main(String[] args) {
        int[] arr = {1,2,9,4,5};
        int res = Maxvalue(arr);
        System.out.println(res);
    }

    static int Maxvalue(int[] arr)
    {
        int max = arr[0];
        for(int i = 1 ; i <arr.length ; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;

    }
}
