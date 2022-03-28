package com.company;

public class demo {
    public static void main(String[] args) {

        int[] arr = {4,3,1,9,7};
        System.out.println(Organize(arr,0,arr.length-1));

    }
    static int Organize(int []arr, int start,int end)
    {
        int i = start-1;
        int pivot = arr[end];

        for(int j=start;j<end;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]=temp;

            }
        }
        i++;
        int temp = arr[i];
        arr[i]=pivot;
        pivot=temp;

        return i;
    }
}
