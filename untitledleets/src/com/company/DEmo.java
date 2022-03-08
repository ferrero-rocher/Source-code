package com.company;

public class DEmo {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target =9;
        int k= nums.length-1;
        int start=0;
        int end =k;

        while(start<=end)
        {
            int  mid = (start+end)/2;

            if(nums[mid]>target)
            {
                end=mid-1;

            }
            else if(nums[mid]<target)
            {
                start=mid+1;

            }
            else
            {
                System.out.println(mid);
            }

        }
        System.out.println("-1");
    }
}
