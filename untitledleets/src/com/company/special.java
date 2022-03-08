package com.company;

public class special {
    public static void main(String[] args) {
        int[] nums={0,4,3,0,4};
        int length=nums.length;
        int x=0;
        int count=x;
        while(x<=length)
        {
         for(int i=0 ; i< length ;i++)
         {
             if(nums[i]>=x)
             {
                 count++;
             }

         }
         if(count==x)
         {
                System.out.println(x);
                break;
         }
         x++;
         count=0;
        }
        System.out.println(-1);
    }
}
