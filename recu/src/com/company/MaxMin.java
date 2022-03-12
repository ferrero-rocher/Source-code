package com.company;

public class MaxMin {

    public static void main(String[] args) {
        int[] a = {2,3,7,9,-2,99,1};
        System.out.println("Max value is " + FindMax(a,0,Integer.MIN_VALUE));
        System.out.println("Min value is " + FindMin(a,0,Integer.MAX_VALUE));


    }
    static int FindMax(int[] a  , int start , int max)
    {
        if(start==a.length)
        {
            return max;
        }
        max=Math.max(max,a[start]);
        start++;
        return(FindMax(a,start,max));

    }
    static int FindMin(int[] a  , int start , int min)
    {
        if(start==a.length-1)
        {
            return min;
        }
        min=Math.min(min,a[start]);
        start++;
        return(FindMin(a,start,min));

    }

}
