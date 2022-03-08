package com.company;

import java.util.Arrays;

public class BulleSort {
    public static void main(String[] args) {
        int [] a = {4,2,3,6,1};
        for(int i=0 ; i<a.length;i++)
        {
            boolean entered = false;
            for(int j=1;j<a.length-i;j++)
            {
                if(a[j]<a[j-1])
                {
                    int temp =a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    entered=true;

                }
            }
            if(entered==false)
            {
                break;
            }

        }
        System.out.println(Arrays.toString(a));

    }
}
