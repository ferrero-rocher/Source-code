package com.company;

import java.util.Arrays;

public class debg {
    public static void main(String[] args) {

        int [] nums ={3,0,1};

        int maxe=0;
        for(int i=0;i<nums.length;i++)
        {
            maxe=Math.max(maxe,nums[i]);
        }
        System.out.println(maxe);

        int[] count =new int [maxe+1];
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
        }
        System.out.println(Arrays.toString(count));

        for(int i=0;i<count.length;i++)
        {
            if(count[i]==0)
            {
                System.out.println(count[i]);
                break;
            }
        }
        System.out.println(count.length);

    }
}
