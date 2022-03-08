package com.company;

import java.util.Arrays;

public class diagsum {
    public static void main(String[] args) {
        int[][] mat = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int m = mat.length;
        int sum=0;

        for(int i=0 ; i<m;i++)
        {
            for(int j=0 ; j<mat[i].length;j++)
            {
                if(i==j | i+j==mat[i].length-1)
                {
                    sum=sum+mat[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}
