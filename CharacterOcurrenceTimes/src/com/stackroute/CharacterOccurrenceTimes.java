package com.stackroute;
import java.util.Scanner;
public class CharacterOccurrenceTimes {              //this class is used to calculate the number of occurences of character in a string
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String string;
        System.out.println("Enter a string");           //Reads input from the user
        string = reader.next();
        int count[] = new int[100];
        int length = string.length();
        int i;
        for(i=0; i<length; i++)
        {
            count[string.charAt(i)]++;               //This array holds the occurrence of each character
        }
        char array[] = new char[length];            //creating another array with the size of the string
        for(i=0; i<length; i++)
        {
            array[i] = string.charAt(i);
            int flag = 0;
            for(int j=0; j<=i; j++)
            {
                if(string.charAt(i)  == array[j]){    //if the char is found then flag is incremented
                    flag++;
                }
            }
            if(flag == 1){
                System.out.println(string.charAt(i)+"..........."+count[string.charAt(i)]);
            }


        }


    }
}
