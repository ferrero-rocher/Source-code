package com.company;

public class Main {

    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        int X=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i]=="--X" || operations[i]=="X--")
            {
                X=X-1;
            }
            else
            {
                X=X+1;
            }
        }
         System.out.println(X);
	//   write your code here
    }
}
