package com.company;

import java.util.Arrays;

public class Flip {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

        for(int i=0 ;i<image.length ;i++)
        {
            int temp=-1;

            for(int j=0 ,k=image[i].length-1 ;j<image[i].length & k>-1;j++,k--)
            {
                if (k>j)
                {
                    temp=image[i][j];
                    image[i][j]=image[i][k];
                    image[i][k]=temp;

                }

            }

        }
        for(int i=0 ;i<image.length;i++)
        {
            for(int j=0 ;j<image[j].length;j++)
            {
                if(image[i][j]==0)
                {
                    image[i][j]=1;
                }
                else
                    image[i][j]=0;
            }
        }

        System.out.println(Arrays.toString(image));
    }
}
