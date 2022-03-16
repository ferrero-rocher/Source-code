package com.company;

public class Main {

    public static void main(String[] args) {
	int[] arr = {1,2,3,1,1};
    int target =4;
    int count=0;
    int sum=0;
        for(int i=0; i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(sum>target)
            {
                 sum=sum-arr[i];
                 count++;
                 sum=arr[i];

            }

        }
        if(arr[arr.length-1]<=target)
        {
            count++;
        }
        System.out.println(count);
    }
}
