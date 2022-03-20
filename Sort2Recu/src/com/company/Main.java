package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {6,3,9,5,2,8};



        Divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));




    }

    static void Divide(int[] arr ,int start ,int end)
    {
        if(start>=end)
        {
            return ;
        }
        int mid = (start+end)/2;
        Divide(arr,start,mid);
        Divide(arr,mid+1,end);
        Arrange(arr,start,mid,end);



    }

    static void Arrange(int[]nums,int left,int mid,int right)
    {
        int[] result = new int[right-left+1];
        int k = 0;
        int i = left;
        int j = mid+1;

        while(i <=mid && j<=right)
        {
            if(nums[i] <= nums[j])
            {
                result[k]=nums[i];
                i++;
            }
            else
            {
                result[k]=nums[j];
                j++;
            }
            k++;

        }

        while(i<=mid)
        {
            result[k]=nums[i];
            i++;
            k++;
        }
        while(j<=right)
        {
            result[k]=nums[j];
            j++;
            k++;
        }

        for(int m=0, n=left;m< result.length;m++,n++)
        {
            nums[n] = result[m];

        }




    }



}
