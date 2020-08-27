package com.stackroute;
import java.util.Scanner;
public class ConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        int flag=0;
        int length;
        System.out.println("Enter elements separated by coma");   //Reads input from the user
        String input;
        input = reader.next();
        String string1[] = new String[7];
        string1= input.split(",");               //The elements are splitted
        int[] string = new int[7];
        for(int i=0;i<7;i++) {
            String number = string1[i];
            string[i] = Integer.parseInt(number); //String elements are converted to integer elements
        }
        for(int i=0;i<6;i++){
            if(string[i]==(string[i+1])-1){     //checks numbers are consecutive or not
                flag=0;
            }
            else{
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("Given numbers are consecutive");
        }
        else{
            System.out.println("Given numbers are not consecutive");
        }

    }
}