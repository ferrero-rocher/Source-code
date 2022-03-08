package com.company;

public class peak {
    public static void main(String[] args) {
        int[] arr ={0,10,5,2,1,0};
        int mid;
        int start = 0;
        int end= arr.length-1;

        while(start<end)

        {
            mid=(start+end)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        System.out.println(start);
    }
}
