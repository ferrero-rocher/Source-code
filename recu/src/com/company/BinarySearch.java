package com.company;

public class BinarySearch {
    public static void main(String[] args) {
      int[] a ={1,2,3,4,6};
      int start = 0;
      int end = a.length-1;
        System.out.println(Search(a,6,start,end));
    }

    static int Search(int[] a,int target,int start, int end )
    {
        int mid = start -(start-end)/2;
        if(start>end)
        {
            return -1 ;
        }
        if(a[mid]==target)
        {
            return mid;
        }
        if(a[mid]<target)
        {
            return Search(a,target,mid+1,end);
        }
        return Search(a,target,start,mid-1);

    }
}
