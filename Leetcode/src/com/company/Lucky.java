package com.company;

import java.util.ArrayList;

public class Lucky {
    public static void main(String[] args) {
        int[][] matrix ={{3,7,8},{9,11,13},{15,16,17}};
        int min;
        int max=0;
        int n=0;
        int k=matrix.length;
        int[] Minvalues = new int[k];
        ArrayList<Integer> res = new ArrayList<>();


        for(int i=0;i<k;i++)
        {
            min=matrix[i][0];
            for(int j=1; j<matrix[i].length;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                }

            }
            Minvalues[n]=min;
            n++;

        }

        for(int i=0;i<k;i++)
        {
            if(Minvalues[i]>max)
            {
                max=Minvalues[i];
            }

        }
        res.add(max);


    }
}
