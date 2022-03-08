package com.company;

public class lcbsstr {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,7};
        int target = 7;
        int start = 1;
        int end = nums.length;
        int l = nums.length;
        boolean potentialAns = false;


        while (start < end) {
            int mid = (start + end) / 2;

            if (BlackBox(nums, l, mid, target) == true) {
                potentialAns = true;
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        if (potentialAns == true) {
            System.out.println(start);
        }
        System.out.println(0);
    }


    static boolean BlackBox(int[] arr, int n, int k, int target) {
        int maxi;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        maxi = sum;

        int l = 0;
        int r = k - 1;
        while (r != n - 1 ) {
            sum = sum - arr[l];
            l++;

            r++;
            sum = sum + arr[r];


            maxi = Math.max(maxi, sum);
        }
//        if(l==r)
//        {
//            while(r!=n-1)
//            {
//                maxi=Math.max(maxi ,arr[r]);
//                r++;
//            }
//        }


        if (maxi >= target) {
            return true;
        }

        return false;

    }
}
