package com.company;

public class cneg {
    public static void main(String[] args) {
        int[][]grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int row = grid.length;
        int col = grid[0].length;
        int count=0;
        int ans=-1;

        for(int i=0;i<row;i++)
        {
            if(grid[i][col-1]>0)
            {
                continue;
            }
            if(grid[i][col-1]<0)
            {
                count=count+col;
                continue;
            }
            else
            {
                int start = 0;
                int end=col-1;
                while(start<=end)
                {
                    int mid =(start+end)/2;
                    if(grid[i][mid]>=0)
                    {
                        start=mid+1;
                    }
                    else
                    {
                        ans=mid;
                        end=mid-1;
                    }
                }
                count=count+(col-ans);


            }

            //count=count+(col-ans);
        }
        System.out.println(count);
    }
}
