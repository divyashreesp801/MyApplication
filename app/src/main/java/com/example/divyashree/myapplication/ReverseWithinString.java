package com.example.divyashree.myapplication;

import java.util.Scanner;

public class ReverseWithinString {
    public static String reversedString(String str)
    {
        String reversed=" ";
        String ar[]=str.split(" ");
        int len=ar.length;
        for(int i=0; i<len; i++)
        {
            StringBuffer rev=new StringBuffer(ar[i]);
            //rev.reverse();
            reversed=reversed+" "+rev.reverse();

        }

        return reversed.trim();
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println(reversedString(s.nextLine()));
    }
}
