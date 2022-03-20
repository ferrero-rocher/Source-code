package com.company;

import java.util.Collections;
import java.util.HashMap;

public class MajEle {
    public static void main(String[] args) {
        int[] nums = {3,2,3};

        int n = nums.length;
        int threshold = n/2;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<n;i++)
        {
            int count = map.getOrDefault(nums[i],0);
            map.put(nums[i],count+1);
        }
        int max = Collections.max(map.values());
        System.out.println(max);

    }
}
