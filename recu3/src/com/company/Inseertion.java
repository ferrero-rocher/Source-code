package com.company;

import java.util.Arrays;

public class Inseertion {
    public static void main(String[] args) {

        int[] arr ={8,5,4,2,1};

        InsRec(arr,0);

        System.out.println(Arrays.toString(arr));

    }
    static void InsRec(int[]arr, int i)
    {
        if(i==arr.length-1)
        {
            return;
        }
        for(int j=i+1; j>0;j--)
        {
            if(arr[j] < arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
            else
            {
                break;
            }
        }
        InsRec(arr,++i);

    }
}
