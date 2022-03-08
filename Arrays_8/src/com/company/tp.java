package com.company;

import java.util.Arrays;

public class tp {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        int idx=0;
        int[] res = new int[nums.length];
        for(int i=0,j=n;i<n&j<nums.length;i++,j++)
        {
            res[idx]=nums[i];
            idx++;
            res[idx]=nums[j];
            idx++;
        }
        System.out.println(Arrays.toString(res));

    }

}
