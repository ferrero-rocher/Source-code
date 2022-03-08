package com.company;

public class perfectsq {
    public static void main(String[] args) {
        int num =99;
        System.out.println(isPerfectSquare(num));

    }
    static boolean isPerfectSquare(int num) {

        int start=1;
        int end=num;

        while(start<=end)
        {
            // int mid = start+end/2;
            int mid =(start+ (end-start)/2);

            if(mid==num/mid && num%mid==0)
            {
                return(true);
            }
            else if (mid>num/mid)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }

        return(false);

    }
}
