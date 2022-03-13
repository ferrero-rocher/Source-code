package com.company;

public class StrLen {
    public static void main(String[] args) {
            String s = "helloY";
            s=s+'\0';
            char[] ch = s.toCharArray();

        System.out.println(FindLength(ch,0));


        }

    static int FindLength(char[] ch , int i)
    {
        //int res = s.charAt(i);
        if(ch[i]=='\0')
        {
            return 0;
        }

       // i++;
        return 1+FindLength(ch,i+1);
    }
}
