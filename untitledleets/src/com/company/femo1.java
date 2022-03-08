package com.company;

public class femo1 {
    public static void main(String[] args) {
        int[] nums ={1,3,5,6};
        int target = 2;
        int start=0;
        int end=nums.length-1;

        while(start<end)
        {
            int mid = start+(end-start)/2;

            if(nums[mid]==target)
            {
                System.out.println(mid);
                break;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }
        System.out.println(start);

    }
}
