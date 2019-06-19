package com.revature.strings;
import java.util.Scanner;

public class Strings {

    public static void main(String[] args)
    {
        System.out.println("Enter the statement you would like to reverse:");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        System.out.println("The reversed statement is:");
        System.out.println(reverse);
    }
}


