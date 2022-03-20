package com.company;

import java.util.Arrays;

public class SelcRec {
    public static void main(String[] args) {
        int[] nums = {20,10,5,49,2,4};

        Selection(nums,nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    static void Selection(int[] arr, int idx)
    {
        if(idx==1)
        {
            return;
        }
        int max=arr[0];
        int posi=0;

        posi=FindElem(arr,idx,max,posi);
        Swap(arr,posi,idx);
        Selection(arr,--idx);

    }


    static void Swap(int[]arr , int a ,int b)
    {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


    static int FindElem(int[] arr, int idx,int max,int posi)
    {

        for( int i=0;i<=idx;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                posi=i;
            }
        }
        return posi;

    }












}
