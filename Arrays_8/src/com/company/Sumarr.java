package com.company;

import java.util.Arrays;

public class Sumarr {
    public static void main(String[] args) {
        int[] arr= {1,1,1,1};
        int sum = 0;
        for(int i=0 ;i<arr.length;i++)
        {
            arr[i]=sum+arr[i];
            sum = arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
