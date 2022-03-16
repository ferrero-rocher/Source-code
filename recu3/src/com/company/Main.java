package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr ={8,5,4,2,1};
        int k= arr.length;
        BubRec(arr,k);

        System.out.println(Arrays.toString(arr));

    }
    static void BubRec(int[] arr , int k)
    {
        if(k==1)
        {
            return;
        }
        for(int i=1;i<k;i++)
        {
            //int swapped=0;
            if(arr[i]<arr[i-1])
            {
                //Swap(arr[i-1],arr[i]);
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;

                //swapped=1;
            }
//            if(swapped==0)
//            {
//             break;
//            }


        }
        BubRec(arr,--k);


    }

    static void Swap(int a ,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }



}
