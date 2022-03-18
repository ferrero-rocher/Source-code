package com.company;

import java.util.Arrays;

public class TrialBubble {
    public static void main(String[] args) {
        int[] nums = {20,10,5,49,2,4};

        for(int idx=nums.length-1;idx>0;idx--)
        {
            int max=nums[0];
            int pos=0;
            for(int i=0;i<=idx;i++)
            {
                if(nums[i]>max)
                {
                    max=nums[i];
                    pos=i;

                }
            }
            Swap(nums,pos,idx);

        }

        System.out.println(Arrays.toString(nums));

    }

    static void Swap(int[]arr , int a ,int b)
    {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


}
