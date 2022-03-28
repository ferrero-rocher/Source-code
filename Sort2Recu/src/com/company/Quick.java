package com.company;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr ={4,3,1,9,7};

        Divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void Divide(int[]arr ,int start,int end)
    {
        if(start<end)
        {
            int pvtidx=Organize(arr,start,end);
            Divide(arr,start,pvtidx-1);
            Divide(arr,pvtidx+1,end);
        }



    }


    static int  Organize(int[]arr ,int start,int end)
    {

        //int i=start;
        int i=start-1;
        int pivot = arr[end];

       for(int j=start ; j<end;j++ )
       {
           if(arr[j]<pivot)
           {
               i++;
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }
       }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[end]=temp;

        return i;
    }





}
