package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class inter {
    public static void main(String[] args) {
        int [] nums1 = {1,2,2,1};
        int [] nums2 = {1,1};
        int m = nums1.length;
        int n = nums2.length;

        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(m>n)
        {
            for(int i=0;i<n;i++)
            {
                boolean res=findDuplicate(nums1,nums2[i],m);
                if(res==true)
                {
                    list.add(nums2[i]);

                }
            }

        }
        else
        {
            for(int i=0;i<m;i++)
            {
                boolean res=findDuplicate(nums2,nums1[i],n);
                if(res==true)
                {
                    list.add(nums1[i]);
                }
            }
        }



        int [] res = new int[list.size()];
        int z=0;


        for (Integer temp : list) {
            res[z] = temp;
            z++;
        }
        System.out.println(res);



    }
    static boolean findDuplicate(int[] nums, int target , int lengths)
    {
        int start =0 ;
        int end = lengths-1;
        while(start<=end)
        {
            int mid =(start+end)/2;

            if(nums[mid] == target)

            {
                nums[mid]=nums[mid]-1;
                return true;
            }
            else if ( nums[mid]> target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }


        }
        return false;

    }
}
