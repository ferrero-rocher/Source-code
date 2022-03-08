package com.company;

import java.util.Arrays;

public class Rev {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Reversearray(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Reversearray(int[] arr)
    {
        int a = 0;
        int b = arr.length-1;
        while (b>a)

        {
            Swap(arr,a,b);
            a++;
            b--;
        }
    }
    static void Swap(int[] arr , int index1 , int index2)
    {
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]=temp;
    }

}
