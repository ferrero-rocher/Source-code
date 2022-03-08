package com.company;

import java.util.ArrayList;

public class miss {
    public static void main(String[] args) {
        int[] arr ={0,10,5,2};
        int max = -1;
        int l=arr.length;
        for(int i=0, j=i+1 ;i<l&j<l  ;i++,j++)
        {
            if(arr[j]>arr[i])
            {
               max=j;
            }
        }
      //  return max;
        System.out.println(max);

    }
}
