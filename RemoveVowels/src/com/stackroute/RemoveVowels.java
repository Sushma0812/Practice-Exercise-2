package com.stackroute;
import java.util.Scanner;
import java.lang.*;
public class RemoveVowels {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the length of string array");
        int length;
        int i;
        length = reader.nextInt();
        String[] string = new String[length];
        System.out.println("Enter the elements");
        for(i=0; i<length; i++)                     //Reads input from the user
        {
            String string1 = reader.next();
            string[i] = string1;
        }
        for(i=0; i<length; i++){
            string[i] = string[i].replaceAll("[AaEeIiOoUu]","");  //Removes all the vowels in array elements
            System.out.println("Place name without vowels: "+string[i]);
        }


    }
}
