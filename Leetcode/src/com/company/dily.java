package com.company;

import java.util.Arrays;

public class dily {
    public static void main(String[] args) {
        String s ="ctoyjrwtngqwt";
        int k=8;
        char fill = 'n';
         int size;
        if(s.length()%k==0)
        {
            size=s.length()/k;
        }
        else
        {
             size= s.length()/k+1;
        }


       String[] output = new String[size];
        int idx=0;
        String result ="";

        for(int i=0;i<s.length();i++)

        {
            result = result+s.charAt(i);
            if(result.length()==k)
            {
                output[idx] = result;
                idx++;
                result="";
            }
        }
        if(result=="")
        {
            System.out.println(Arrays.toString(output));
        }
        else
        {

            while(result.length()!=k)
            {
                result=result+fill;


            }
            output[idx] = result;


            System.out.println(Arrays.toString(output));
        }
    }
}
