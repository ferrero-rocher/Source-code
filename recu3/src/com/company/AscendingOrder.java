package com.company;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] arr ={1,2,-7};
        int i=1;
        int j=arr.length;
        System.out.println(IsSorted(arr,i,j));

    }
    static boolean IsSorted(int[]arr, int i , int j)
    {
        if(i==j)
        {
            return true;
        }
        return  arr[i]>arr[i-1] ? IsSorted(arr,++i,j):false;
    }
}
