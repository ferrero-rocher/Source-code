package com.company;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        int start=0;
        int end=s.length-1;

        System.out.println(Reverse(s,start,end));


        }
    static char[] Reverse(char[] s, int start, int end)
    {
        if(start>=end)
        {
            return s;

        }
        Swap(s, start,end);
        start++;
        end--;
        return Reverse(s,start,end);

    }
    static void Swap(char[]s, int start,int end)
    {
        int temp = s[start];
        s[start]=s[end];
        s[end] = (char) temp;
    }
}
