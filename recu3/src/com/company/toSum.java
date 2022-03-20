package com.company;

import java.util.*;

public class toSum {
    public static void main(String[] args) {


        int [] nums ={2,7,11,15,15};
        int target = 30;

        int[] res = new int[2];


        HashMap<Integer, List<Integer>> map = new HashMap<Integer,List<Integer>>(nums.length);
        for(int i=0;i<nums.length;i++)
        {
      //      map.put(nums[i],i);
        }


        for(int i=0;i<nums.length;i++)
        {
            int find = target - nums[i];
            if(map.containsKey(find))
            {
                res[0]= i;
                map.remove(find,i);

               // res[1] = map.get(find);

            }
        }

       // System.out.println(Arrays.toString(map));


    }
}
