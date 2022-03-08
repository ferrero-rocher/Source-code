package com.company;

import java.util.Arrays;

public class Double {
    public static void main(String[] args) {
        int[] arr ={10,2,5,3};
        boolean result;
        Arrays.sort(arr);
        for(int i = 0 ;i<arr.length ;i++)
        {
            result = checkDouble(arr, 2*arr[i]);
            if(result==true)
            {
                System.out.println(true);
                break;
            }
        }
        System.out.println(false);

    }
    static boolean checkDouble(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==target)
            {
                return true;

            }
            else if (arr[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }

        }
        return false;
    }
}
