package com.company;

public class blavkbox {
    public static void main(String[] args) {

        int [] nums ={1,2,5,9};
        int div =4;

        int threshold =6;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            int ans = (int)(Math.ceil(nums[i]/div));


            sum=sum+ans;

        }
        System.out.println(sum);


    }

}
