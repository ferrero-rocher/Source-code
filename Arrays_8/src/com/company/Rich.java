package com.company;

import java.util.Arrays;

public class Rich {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int mid = nums.length/2;            //mid =3 , length =6
        int[] res = new int[nums.length];
        int j = 1;
        int k =0;
        for(int i=0;i<mid;i++)
        {
            do {
                res[k] = nums[i];
                k+=2;

            }
            while(false);
        }



        for(int i=mid ;i<nums.length;i++)
       {
            do {
                res[j]=nums[i];
                j+=2;
            }
            while(false);
        }
        System.out.println(Arrays.toString(res));
    }
}
