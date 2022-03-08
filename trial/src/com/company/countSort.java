package com.company;

import java.util.Arrays;

public class countSort {
    public static void main(String[] args) {
        int[] a ={3,4,2,2,1,1};
        int sum=0;
        int maxe=-1;
        for(int i=0;i<a.length;i++)
        {
            maxe=Math.max(maxe,a[i]);
        }
        int[] count=new int[maxe+1];
        for(int i=0;i<a.length;i++)
        {
            count[a[i]]++;
        }
        System.out.println(Arrays.toString(count));

        for(int i=0;i<count.length;i++)
        {
            count[i] = sum+count[i];
            sum=count[i];
        }
        System.out.println(Arrays.toString(count));

        for(int i=count.length-1;i>0;i--)
        {
            count[i]=count[i-1];
        }
        count[0]=0;

        int[] result = new int[a.length];


        for(int i=a.length-1;i>=0;i--)
        {
            result[count[a[i]]]=a[i];
            count[a[i]]++;
        }


        System.out.println(Arrays.toString(result));

    }
}
