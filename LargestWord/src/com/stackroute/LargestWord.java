package com.stackroute;
import java.util.Scanner;

public class LargestWord {          //This class is used to find largest word in the given string

    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        String large = " ";
        String string;
        String word = " ";                      //Add extra space after string to get the last ord in the string
        int length = 0;
        int i;
        String[] words = new String[150];
        System.out.println("Enter a string");
        string = reader.next();
        string = string + " ";
        for(i=0; i<string.length(); i++)
        {
            if(string.charAt(i) != ' '){           //split the string into words
                word = word +string.charAt(i);
            }
            else{
                words[length] = word;            //add word to array words
                length++;
                word = " ";
            }
        }
        large = words[0];
        for(i=0;i<length;i++)
        {
            if(large.length() < words[i].length()){           //largest word in the string is stored
                large = words[i];
            }

        }
        System.out.println("Largest word in the given string is "+large);



    }
}
