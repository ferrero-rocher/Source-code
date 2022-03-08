package com.company;

public class sqre {
    public static void main(String[] args) {
        int x=8;
        int start =1;
        int ans=-1;
        int end= Integer.MAX_VALUE;

        while(start<=end)
        {
//           int mid =(start+end)/2
            int mid = start +(end-start)/2 ;

            if(mid==x/mid)
            {
                System.out.println(mid);
                break;
            }
            else if (mid>x/mid)
            {
                ans=mid;
                end = mid-1;
            }

            else
            {
                start=mid+1;
            }

        }


        System.out.println(ans-1);
    }
}
