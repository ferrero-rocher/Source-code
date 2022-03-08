package com.company;

import java.util.Arrays;

public class demo2 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        int[] res = new int[nums1.length+nums2.length];
        int size = res.length;
        int value=size/2;

        for(int i=0;i<nums1.length;i++)
        {
            res[i]=nums1[i];
        }

        for(int i=0 ;i<nums2.length;i++)
        {
            res[nums1.length+i]=nums2[i];
        }
        Arrays.sort(res);

        if(size%2==0)
        {

            double ans =Double.valueOf(res[value-1]+res[value])/2;
            System.out.println(ans);
        }
        else {
            System.out.println(res[value]);
        }

    }
}
