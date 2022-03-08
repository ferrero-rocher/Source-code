package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bitonic {
    public static void main(String[] args) {
       int[] nums = {4,5,6,7,0,1,2};
       int inipos = inipos(nums);
        System.out.println(inipos+1);


    }
    static int inipos (int[] nums )
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(mid<end && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            else if(mid>start && nums[mid]<nums[mid-1])
            {
                return mid-1;
            }
            else if(nums[mid]<=nums[start])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }



        }
        return -1;
    }

}
