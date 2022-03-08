package com.company;

import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k=3;
        int temp;
        int size = nums.length;
        while(k>0)
        {
            for(int i=size-1;i>0;i--)
            {
                temp =nums[i];
                nums[i]=nums[i-1];
                nums[i-1]=temp;

            }
            k--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
