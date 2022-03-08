package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] a = {4,2,3,6,1};
        for(int i=0;i<a.length;i++)
        {
            int last = a.length-i-1;
            int res = getMaxIndex(a,0,last);
            swap(a,res,last);
        }
        System.out.println(Arrays.toString(a));

    }

    static void swap(int[] a, int res, int last) {
        int temp=a[res];
        a[res]=a[last];
        a[last]=temp;
    }

    static int getMaxIndex(int[] a, int start, int last) {
        int maxi=start;
        for(int i=0;i<=last;i++)
        {
            if(a[i]>a[maxi])
            {
                maxi=i;
            }
        }
        return maxi;
    }


}
