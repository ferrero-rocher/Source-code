package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0 };
        int idx;
        int val;

        int[] res = new int[nums.length];
        Arrays.fill(res,-1);
        for(int i=0,j=0 ;i<index.length&j<nums.length;i++,j++)
        {
            idx=index[i];
            val=nums[j];
            InserRes(res,idx,val);

        }
        System.out.println(Arrays.toString(res));
    }

    static void InserRes(int[] res, int index ,int value)
    {
        if(res[index]==-1)
        {
            res[index]=value;
        }
        else
        {
            int temp;
            for(int i=index ; i<res.length;i++)
            {
                temp=res[i];
                res[i]=value;
                value=temp;
            }
            //right shift from res[index] <-> length
            //            res[index]=value;
        }

    }
}
