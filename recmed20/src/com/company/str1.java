package com.company;

public class str1 {
    public static void main(String[] args) {

        String s = "baccappled";
        Print(s,"");

    }

    static void Print (String s, String res)
    {
        if(s.isEmpty())

        {
            System.out.println(res);
            return;
        }
        char current = s.charAt(0);

        if(current == 'a')
        {
            Print(s.substring(1),res);
        }
        Print(s.substring(1),res+current);

    }
}
