package com.company;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,3,5,5,5,5,67,123,165};
        int target=5;
        int[] res={-1,-1};

        if(nums.length==1)
        {
            if(nums[0]==target)
            {
                res[0]=0;
                res[1]=0;
            }
        }
        else
        {
            res[0]=Searchoccurance(nums,target,true);
            res[1]=Searchoccurance(nums,target,false);
        }


        System.out.println(Arrays.toString(res));
    }

    static int Searchoccurance(int[] nums, int target , boolean firstocc)
    {
        int k=nums.length;
        int start =0;
        int end = k-1;
        int mid;
        int ans=-1;

        while(start<=end)
        {
            mid=(start+end)/2;
            if(target < nums[mid])
            {
                start = mid + 1;

            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                ans=mid;//potential ans
                if(firstocc)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }

        return ans;
    }
}
