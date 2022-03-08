package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Listaa {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k=34;
        ArrayList<Integer> sol = new ArrayList<>();
        int res=0;
        for(int i=0 ;i<num.length;i++)
        {
            res=res*10+num[i];
        }
        res=res+k;
        int ans;
        int length = (int)(Math.log10(res)+1);
        while(res>0)
        {
            ans=res%10;
            sol.add(ans);
            res=res/10;
            length--;

        }
        Collections.reverse(sol);
        for(int value:sol)
        {
            System.out.print(value);
        }
    }
}
