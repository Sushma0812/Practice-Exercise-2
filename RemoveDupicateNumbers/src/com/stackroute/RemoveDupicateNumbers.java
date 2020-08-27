package com.stackroute;
import java.util.Scanner;
public class RemoveDupicateNumbers {                 //This class is used to remove duplicate elements
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int size;
        int i;
        int j = 0;
        System.out.println("Enter size");           //Reads the length of the array from the user
        size = reader.nextInt();
        int[] array = new int[size];
        int[] temp = new int[size];
        System.out.println("Enter array elements");  //Reads array elements from the user
        for (i = 0; i < size; i++) {
            array[i] = reader.nextInt();
        }
        for (i = 0; i < size - 1; i++)                   //Removal of duplicate elements 
        {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[size - 1];
        for (i = 0; i < j; i++) {
            array[i] = temp[i];
        }
        for (j = 0; j < size - 1; j++) {
            System.out.println("Array elements " + array[j]);
        }
    }
}