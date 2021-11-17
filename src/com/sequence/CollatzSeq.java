package com.sequence;

import java.util.Scanner;

public class CollatzSeq {

    public static void main(String[] args) {
	// write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        while(n!=1)
        {
            System.out.println(n);
            if(n%2==0)
            {
                n=n/2;
                count++;
            }
            else
            {
                n=3*n+1;
                count++;
            }
        }
        System.out.println(n);
        System.out.print(count);
    }
}
