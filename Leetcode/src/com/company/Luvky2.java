package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Luvky2 {
    public static void main(String[] args) {
        int[][] matrix ={{1,10,4,2},{9,3,8,7},{15,16,17,12}};

        int m = matrix.length;
        int n = matrix[0].length;
        int[] min = new int[m];
        int[] max = new int[n];
        Arrays.fill(min,Integer.MAX_VALUE);


        for(int i=0 ;i<m;i++)
        {
            for(int j=0 ;j<n;j++)
            {
                min[i]=Math.min(min[i],matrix[i][j]);
                max[j]= Math.max(max[i],matrix[i][j]);

            }
        }
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(min[i]==max[j])
                {
                    res.add(min[i]);
                    break;
                }
            }
        }
        System.out.println(res);

    }
}
