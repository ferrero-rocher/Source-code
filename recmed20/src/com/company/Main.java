package com.company;

public class Main {

    public static void main(String[] args) {

        String s= "abcd";
        String rev= "";
       // System.out.println(Reverse(s,s.length()-1,rev));

        Reverse2(s,0,rev);


    }
    static String Reverse(String s,int index,String rev)
    {
        if(index<0)
        {
            return rev;
        }
        rev = rev + s.charAt(index);
        return (Reverse(s,--index,rev));
    }


    static void Reverse2(String s,int index,String rev)
    {
      if(index==s.length())
        {
            return ;
        }
      Reverse2(s,++index,rev);
      //rev = rev + s.charAt(index);
        index=index-1;      System.out.println(s.charAt(index));

    }
}
